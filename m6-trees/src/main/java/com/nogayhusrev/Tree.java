package com.nogayhusrev;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }

        var curr = root;
        while (true) {
            if (value < curr.value) {
                if (curr.leftChild == null) {
                    curr.leftChild = node;
                    return;
                }
                curr = curr.leftChild;
            } else {
                if (curr.rightChild == null) {
                    curr.rightChild = node;
                    return;
                }
                curr = curr.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;
        while (current != null) {
            if (value < current.value)
                current = current.leftChild;
            else if (value > current.value)
                current = current.rightChild;
            else
                return true;
        }
        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traversePostOrder(root.leftChild);
        traversePostOrder(root.rightChild);
        System.out.println(root.value);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(
                height(root.leftChild),
                height(root.rightChild)
        );
    }

    private static boolean isLeaf(Node root) {
        return root.leftChild == null && root.rightChild == null;
    }

    public int minBinarySearchTree() {
        if (root == null)
            throw new IllegalStateException();

        var current = root;
        var last = current;
        while (current != null) {
            last = current;
            current = current.leftChild;
        }
        return last.value;
    }

    public int min() {
        return min(root);
    }

    //    Min for non-binarySearchTree
    private int min(Node root) {
        if (isLeaf(root))
            return root.value;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(
                Math.min(left, right),
                root.value
        );
    }

    public boolean equals(Tree other) {
        if (other == null)
            return false;

        return equals(root, other.root);
    }

    private boolean equals(Node first, Node second) {
        if (first == null && second == null)
            return true;

        if (first != null && second != null)
            return first.value == second.value
                    && equals(first.leftChild, second.leftChild)
                    && equals(first.rightChild, second.rightChild);

        return false;
    }

    public boolean isBinarySearchTree() {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean isBinarySearchTree(Node root, int min, int max) {
        if (root == null)
            return true;

        if (root.value < min || root.value > max)
            return false;

        return
                isBinarySearchTree(root.leftChild, min, root.value - 1)
                        && isBinarySearchTree(root.rightChild, root.value + 1, max);
    }

    public ArrayList<Integer> getNodesAtDistance(int distance) {
        var list = new ArrayList<Integer>();
        getNodesAtDistance(root, distance, list);
        return list;
    }

    private void getNodesAtDistance(Node root, int distance, ArrayList<Integer> list) {
        if (root == null)
            return;

        if (distance == 0) {
            list.add(root.value);
            return;
        }

        getNodesAtDistance(root.leftChild, distance - 1, list);
        getNodesAtDistance(root.rightChild, distance - 1, list);
    }

    public ArrayList<ArrayList<Integer>> traverseLevelOrder() {
        var list = new ArrayList<ArrayList<Integer>>();
        for (var i = 0; i <= height(); i++) {
            var tempList = new ArrayList<Integer>();
            for (var value : getNodesAtDistance(i))
                tempList.add(value);

            list.add(tempList);
        }

        return list;
    }

    /* ==============EXERCISES============== */

    // 1- Implement a method to calculate the size of a binary tree.  Solution: Tree.size()
    public int size() {
        return size(root);
    }

    private int size(Node root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + size(root.leftChild) + size(root.rightChild);
        }
    }

    // 2- Implement a method to count the number of leaves in a binary tree.  Solution: Tree.countLeaves()
    public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(Node root) {
        if (root == null)
            return 0;

        if (isLeaf(root))
            return 1;

        return countLeaves(root.leftChild) + countLeaves(root.rightChild);
    }

    // 3- Implement a method to return the maximum value in a binary search tree using recursion.  Solution: Tree.max()
    public int max() {
        if (root == null)
            throw new IllegalStateException();
        return max(root);
    }

    private int max(Node root) {
        if (root.rightChild != null)
            return max(root.rightChild);

        return root.value;

    }

    // 4- Implement a method to check for the existence of a value in a binary tree using recursion.
    // Compare this method with the find() method. The find() method does the same job using iteration.  Solution: Tree.contains()

    public boolean contains(int value) {

        return contains(root, value);
    }

    private boolean contains(Node root, int value) {
        if (root == null)
            return false;

        if (root.value == value)
            return true;

        return contains(root.leftChild, value) || contains(root.rightChild, value);
    }

    // 5- Implement a method to check to see if two values are siblings in a binary tree.  Solution: Tree.areSibling()
    public boolean areSibling(int first, int second) {
        return areSibling(root, first, second);
    }

    private boolean areSibling(Node root, int first, int second) {
        if (root == null) {
            return false;
        }

        if (root.leftChild != null && root.rightChild != null) {
            if ((root.leftChild.value == first && root.rightChild.value == second) ||
                    (root.leftChild.value == second && root.rightChild.value == first)) {
                return true;
            }
        }

        return areSibling(root.leftChild, first, second) || areSibling(root.rightChild, first, second);

    }

    // 6- Implement a method to return the ancestors of a value in a List<Integer>.  Solution: Tree.getAncestors()
    public List<Integer> getAncestors(int value) {
        var list = new ArrayList<Integer>();
        getAncestors(root, value, list);
        return list;
    }

    private boolean getAncestors(Node root, int value, ArrayList<Integer> list) {
        if (root == null)
            return false;

        if (root.value == value)
            return true;

        if ( getAncestors(root.leftChild,value,list) ||getAncestors(root.rightChild,value, list)){
            list.add(root.value);
            return true;
        }

        return false;

    }




    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;


        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + value;
        }
    }
}
