package com.nogayhusrev;

import java.util.Arrays;

public class ArrayQueue {

    private int items[];
    private int front;
    private int rear;

    private int count;


    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        items[rear] = item;
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue() {
        var item = items[front];

        items[front] = 0;
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }


    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(40);
        queue.enqueue(40);
        queue.enqueue(40);


        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(40);
        queue.enqueue(40);
        queue.enqueue(40);
        System.out.println(queue);
    }
}
