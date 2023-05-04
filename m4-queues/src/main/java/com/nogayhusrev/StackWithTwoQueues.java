package com.nogayhusrev;

import java.util.ArrayDeque;
import java.util.Queue;


public class StackWithTwoQueues {
    private Queue<Integer> queue1 = new ArrayDeque<>();
    private Queue<Integer> queue2 = new ArrayDeque<>();
    private int top;


    public void push(int item) {
        queue1.add(item);
        top = item;
    }


    public int pop() {
        if (isEmpty())
            throw new IllegalStateException();

        while (queue1.size() > 1) {
            top = queue1.remove();
            queue2.add(top);
        }

        swapQueues();

        return queue2.remove();
    }

    private void swapQueues() {
        var temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }


    public boolean isEmpty() {
        return queue1.isEmpty();
    }


    public int size() {
        return queue1.size();
    }


    public int peek() {
        if (isEmpty())
            throw new IllegalStateException();

        return top;
    }

    @Override
    public String toString() {
        return queue1.toString();
    }
}
