package com.nogayhusrev;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        System.out.println("Hello world!");

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
