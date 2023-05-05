package com.nogayhusrev;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashTableExercises {

    /*
    1- Find the most repeated element in an array of integers. What is the time complexity of this method?
    (A variation of this exercise is finding the most repeated word in a sentence. The algorithm is the same.
    Here we use an array of numbers for simplicity.)
    Input: [1, 2, 2, 3, 3, 3, 4]
    Output: 3
    Solution: HashTableExercises.mostFrequent()
    */
    public static int mostFrequent(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.putIfAbsent(i, 1);
        }

        return map.keySet().stream().max(Integer::compareTo).get();
    }


    /*
    2- Given an array of integers, count the number of unique pairs of integers that have difference k.
    Input: [1, 7, 5, 9, 2, 12, 3] K=2
    Output: 4
    We have four pairs with difference 2: (1, 3), (3, 5), (5, 7), (7, 9). Note that we only want the number of these pairs, not the pairs themselves.
    Solution: HashTableExercises.countPairsWithDiff()

    To solve this problem, we can follow the below steps:

    Create a set to store unique integers in the input array.
    Initialize a counter variable to 0.
    Loop through each integer in the set and check if the set contains an integer that is equal to the current integer plus k. If it does,
    increment the counter variable.
    Return the counter variable.

    */
    public static int countPairsWithDiff(int[] array, int k) {
        HashSet<Integer> set = new HashSet<>();
        int counter = 0;

        for (int i : array)
            set.add(i);

        for (int i : array)
            if (set.contains(i + k))
                counter++;

        return counter;

    }



    /*
     3- Given an array of integers, return indices of the two numbers such that they add up to a specific target.

    Input: [2, 7, 11, 15] - target = 9
    Output: [0, 1] (because 2 + 7 = 9)
    Assume that each input has exactly one solution, and you may not use the same element twice.
    Solution: HashTableExercises.twoSum()

    */

    public static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(array[i], i);
        }

        throw new IllegalStateException();
    }


}
