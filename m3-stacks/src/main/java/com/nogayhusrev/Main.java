package com.nogayhusrev;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        System.out.println("=================StringReverser=================");
        String str = "abcd";
        StringReverser stringReverser = new StringReverser();
        System.out.println(str + " --------> " + stringReverser.reverse(str));
        System.out.println();

        System.out.println("=================ExpressionBalanced=================");
        str = "{(1 + 2)}";
        System.out.println(str + " --------> " + new Expression().isBalanced(str));
        System.out.println();

    }
}