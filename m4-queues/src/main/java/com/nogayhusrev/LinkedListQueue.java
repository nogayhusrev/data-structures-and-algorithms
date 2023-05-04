package com.nogayhusrev;

import java.util.NoSuchElementException;

public class LinkedListQueue {

    private Node first;
    private Node last;
    private int size;

    public void enqueue(int item) {
        var node = new Node(item);

        if (isEmpty()) {
            first = last = node;
        }

        node.next = first;
        first = node;
        size++;
    }

    public int peek(int item) {
        return first.value;
    }


    public void dequeue() {
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;

        } else {
            var second = first.next;
            first.next = null;
            first = second;

        }

        size--;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return size;
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
