package com.nogayhusrev;

public class AvlTree {
  private class AvlNode {
    private int height;
    private int value;
    private AvlNode leftChild;
    private AvlNode rightChild;

    public AvlNode(int value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return "Value=" + this.value;
    }
  }

  private AvlNode root;

  public void insert(int value) {
    root = insert(root, value);
  }

  private AvlNode insert(AvlNode root, int value) {
    if (root == null)
      return new AvlNode(value);

    if (value < root.value)
      root.leftChild = insert(root.leftChild, value);
    else
      root.rightChild = insert(root.rightChild, value);

    setHeight(root);

    return balance(root);
  }

  private AvlNode balance(AvlNode root) {
    if (isLeftHeavy(root)) {
      if (balanceFactor(root.leftChild) < 0)
        root.leftChild = rotateLeft(root.leftChild);
      return rotateRight(root);
    }
    else if (isRightHeavy(root)) {
      if (balanceFactor(root.rightChild) > 0)
        root.rightChild = rotateRight(root.rightChild);
      return rotateLeft(root);
    }
    return root;
  }

  private AvlNode rotateLeft(AvlNode root) {
    var newRoot = root.rightChild;

    root.rightChild = newRoot.leftChild;
    newRoot.leftChild = root;

    setHeight(root);
    setHeight(newRoot);

    return newRoot;
  }

  private AvlNode rotateRight(AvlNode root) {
    var newRoot = root.leftChild;

    root.leftChild = newRoot.rightChild;
    newRoot.rightChild = root;

    setHeight(root);
    setHeight(newRoot);

    return newRoot;
  }

  private void setHeight(AvlNode node) {
    node.height = Math.max(
            height(node.leftChild),
            height(node.rightChild)) + 1;
  }

  private boolean isLeftHeavy(AvlNode node) {
    return balanceFactor(node) > 1;
  }

  private boolean isRightHeavy(AvlNode node) {
    return balanceFactor(node) < -1;
  }

  private int balanceFactor(AvlNode node) {
    return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
  }

  private int height(AvlNode node) {
    return (node == null) ? -1 : node.height;
  }
}
