package com.nogayhusrev;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        var heap = new Heap(10);
//        heap.insert(10);
//        heap.insert(5);
//        heap.insert(17);
//        heap.insert(4);
//        heap.insert(22);
//        heap.remove();
//
//        System.out.println("Done");


        /*=============== HEAP SORT ===============*/
//        int[] numbers = {5,3,10,1,4,2};
//        var heap = new Heap(10);
//
//        for (var number : numbers)
//            heap.insert(number);
//
//        while (!heap.isEmpty())
//            System.out.println(heap.remove());


        /*=============== HEAPIFY ===============*/
        int[] numbers1 = {5, 3, 8, 4, 1, 2};

        Heapify.heapify(numbers1);
        System.out.println(Arrays.toString(numbers1));
        System.out.println("=========================");

        int[] numbers2 = {5, 3, 8, 4, 1, 2};
        Heapify.optimizedHeapify(numbers2);
        System.out.println(Arrays.toString(numbers2));


        /*=============== GET KTH LARGEST ===============*/




    }
}