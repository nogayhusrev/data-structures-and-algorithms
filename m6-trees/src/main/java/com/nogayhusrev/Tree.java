package com.nogayhusrev;

public class Tree {

    private Node root;

    public void insert(int value){
        var node = new Node(value);

        if (root == null){
            root = node;
            return;
        }

        var curr = root;
        while (true){
            if (value < curr.value){
                if (curr.leftChild == null){
                    curr.leftChild = node;
                    return;
                }
                curr = curr.leftChild;
            }else {
                if (curr.rightChild == null){
                    curr.rightChild = node;
                    return;
                }
                curr = curr.rightChild;
            }
        }
    }

    public boolean find(int value){
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




    private class Node{
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
