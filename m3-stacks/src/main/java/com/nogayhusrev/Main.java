package com.nogayhusrev;

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

        System.out.println("=================StackImplementation=================");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.peek();
        System.out.println(stack.isEmpty());
        System.out.println(stack);
        System.out.println();

    }
}