package com.nogayhusrev;

import java.util.Arrays;

public class PriorityQueue {
    private int[] items;
    private int count;

    public PriorityQueue(int capacity) {
        items = new int[capacity];
    }

    public void add(int item) {
        if (isFull())
            throw new IllegalStateException();

        int i = shiftItemsTOInsert(item);

        items[i] = item;
        count++;

    }

    private int shiftItemsTOInsert(int item) {
        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item)
                items[i + 1] = items[i];
            else
                break;
        }
        return i + 1;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public String toString() {
        return "PriorityQueue{" +
                "items=" + Arrays.toString(items) +
                '}';
    }

    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue(10);
        queue.add(10);
        queue.add(500);
        queue.add(30);
        queue.add(40);

        System.out.println(queue);

    }

}
