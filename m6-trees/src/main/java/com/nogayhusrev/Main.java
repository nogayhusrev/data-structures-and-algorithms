package com.nogayhusrev;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.insert(5);
        tree.insert(7);
        tree.insert(-3);
        tree.insert(12);
        tree.insert(13);
        tree.insert(19);

//        Tree tree2 = new Tree();
//        tree2.insert(7);
//        tree2.insert(4);
//        tree2.insert(9);
//        tree2.insert(1);
//        tree2.insert(6);
//        tree2.insert(8);
//        tree2.insert(10);


//        System.out.println("============traversePreOrder()============");
//        tree.traversePreOrder();
//        System.out.println();
//        System.out.println("============traverseInOrder()============");
//        tree.traverseInOrder();
//        System.out.println();
//        System.out.println("============traversePostOrder()============");
//        tree.traversePostOrder();

//        System.out.println();
//        System.out.println("============min()============");
//        System.out.println(tree.min());

//        System.out.println();
//        System.out.println("============equals()============");
//        System.out.println(tree.equals(tree2));

//        System.out.println();
//        System.out.println("============isBinarySearchTree()============");
//        System.out.println(tree.isBinarySearchTree());

//        System.out.println();
//        System.out.println("============printNodesDistance()============");
//        System.out.println(tree.getNodesAtDistance(2));

//        System.out.println();
//        System.out.println("============levelOrderTraversalWithQueue()============");
//        System.out.println(tree.traverseLevelOrder());

//        System.out.println();
//        System.out.println("============size()============");
//        System.out.println(tree.size());

//        System.out.println();
//        System.out.println("============countLeaves()============");
//        System.out.println(tree.countLeaves());

//        System.out.println();
//        System.out.println("============max()============");
//        System.out.println(tree.max());

        System.out.println();
        System.out.println("============getAncestors()============");
        System.out.println(tree.getAncestors(13));


    }
}