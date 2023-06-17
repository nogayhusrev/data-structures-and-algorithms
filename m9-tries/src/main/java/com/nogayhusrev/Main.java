package com.nogayhusrev;

public class Main {
    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("care");
        trie.insert("car");
        trie.insert("careful");
        System.out.println("Done");

        trie.traverse();

        trie.remove("careful");
        trie.traverse();
    }
}