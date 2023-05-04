package com.nogayhusrev;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.addLast(12);
        list.addLast(13);
        list.addLast(14);
        list.addLast(143);
        list.addLast(144);
        list.addLast(1442);

//        System.out.println(list.getKthFromTheEnd(-5));

        System.out.println(list.hasCycle());

        list.printMiddle();

        int[] aa = list.toArray();

        System.out.println(Arrays.toString(aa));

    }
}