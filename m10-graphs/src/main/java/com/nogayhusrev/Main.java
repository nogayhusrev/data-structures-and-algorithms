package com.nogayhusrev;

public class Main {
    public static void main(String[] args) {

        var graph = new Graph();
//        graph.addNode("A");
//        graph.addNode("B");
//        graph.addNode("C");
//        graph.addNode("D");
//        graph.addEdge("A", "B");
//        graph.addEdge("A", "C");
//        graph.addEdge("A", "D");
//        graph.addEdge("B", "C");
//        graph.addEdge("C", "A");

//        graph.print();
//        System.out.println("*****************");
//        graph.removeNode("B");
//        graph.print();


//        graph.traverseDepthFirst("B");
//        graph.traverseDepthFirst("D");

//        graph.traverseDepthFirstIterative("A");
//        graph.traverseDepthFirstIterative("D");
//        graph.traverseDepthFirstIterative("A");

//        graph.traverseBreadthFirst("A");


        graph.addNode("X");
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("P");
        graph.addEdge("X","A");
        graph.addEdge("X","B");
        graph.addEdge("A","P");
        graph.addEdge("B","P");

        System.out.println(graph.topologicalSort());
        System.out.println("graph.hasCycle() = " + graph.hasCycle());

    }
}