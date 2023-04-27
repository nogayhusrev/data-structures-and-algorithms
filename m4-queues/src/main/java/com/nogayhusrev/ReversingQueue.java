package com.nogayhusrev;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReversingQueue {

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        while (!queue.isEmpty())
            stack.push(queue.remove());

        while (!stack.isEmpty())
            queue.add(stack.pop());

    }

    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue);

        ReversingQueue.reverse(queue);

        System.out.println(queue);
    }
}
