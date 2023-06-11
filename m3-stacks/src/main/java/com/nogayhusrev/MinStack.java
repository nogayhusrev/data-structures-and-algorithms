package com.nogayhusrev;

import java.util.Stack;

public class MinStack {
    private Stack<Integer> stack;  // main stack to store elements
    private Stack<Integer> minStack;  // stack to track the minimum values

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(5);
//        stack.push(2);
//        stack.push(-1);
//        stack.push(-2);
        stack.push(243);
        stack.push(3);
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(3);
        stack.push(10);
        stack.push(1);

        System.out.println(stack.min());
        stack.pop();
        System.out.println(stack.min());

    }

    public void push(int value) {
        stack.push(value);  // push the value to the main stack

        // update the minStack with the new minimum value
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public int pop() {
        if (stack.isEmpty()) {
            return -1;  // return -1 if the stack is empty or handle the error differently
        }

        int value = stack.pop();  // pop the value from the main stack

        // if the popped value is the minimum value, remove it from the minStack
        if (value == minStack.peek()) {
            minStack.pop();
        }

        return value;
    }

    public int min() {
        if (minStack.isEmpty()) {
            return -1;  // return -1 if the stack is empty or handle the error differently
        }

        return minStack.peek();  // return the top element of the minStack
    }
}
