package com.nogayhusrev;

public class Main {
    public static void main(String[] args) {
        var trie = new Trie();

        trie.insert("care");
        trie.insert("car");
        trie.insert("careful");
        trie.insert("carefully");

        System.out.println(trie.findWords("car"));

        System.out.println(trie.containsRecursive("car"));




    }
}