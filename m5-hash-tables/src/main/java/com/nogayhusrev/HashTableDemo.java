package com.nogayhusrev;

import java.util.Arrays;

public class HashTableDemo {

    public static void main(String[] args) {

//        HashTable hashTable = new HashTable();
//        hashTable.put(1,"A");
//        hashTable.put(2,"B");
//        hashTable.put(4,"r");
//        hashTable.remove(1);
//        System.out.println(hashTable);

        System.out.println("====================mostFrequent()====================");
        System.out.println(HashTableExercises.mostFrequent(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 9, 9, 9}));
        System.out.println();

        System.out.println("====================countPairsWithDiff()====================");
        System.out.println(HashTableExercises.countPairsWithDiff(new int[]{1, 7, 5, 9, 2, 12, 3}, 2));
        System.out.println();

        System.out.println("====================twoSum()====================");
        System.out.println(Arrays.toString(HashTableExercises.twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println();


    }
}
