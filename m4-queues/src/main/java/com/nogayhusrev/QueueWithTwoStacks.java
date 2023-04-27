package com.nogayhusrev;

import java.util.Stack;

public class QueueWithTwoStacks {
  private Stack<Integer> stack1 = new Stack<>();
  private Stack<Integer> stack2 = new Stack<>();

  public void enqueue(int item) {
    stack1.push(item);
  }

  public int dequeue() {
    if (isEmpty())
      throw new IllegalStateException();

    moveStack1ToStack2();

    return stack2.peek();

  }

  public int peek() {
    if (isEmpty())
      throw new IllegalStateException();

    moveStack1ToStack2();

    return stack2.pop();

  }

  private void moveStack1ToStack2() {
    if (stack2.isEmpty())
      while (!stack1.isEmpty())
        stack2.push(stack1.pop());
  }

  public boolean isEmpty() {
    return stack2.isEmpty() && stack2.isEmpty();
  }

  @Override
  public String toString() {
    return "QueueWithTwoStacks{" +
            "stack1=" + stack1 +
            ", stack2=" + stack2 +
            '}';
  }

  public static void main(String[] args) {
    QueueWithTwoStacks queue = new QueueWithTwoStacks();
    queue.enqueue(10);
    queue.enqueue(20);
    queue.enqueue(30);
    queue.enqueue(40);


    System.out.println(queue.dequeue());
    System.out.println(queue);
  }

}
