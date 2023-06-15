package com.nogayhusrev;

public class Main {
    public static void main(String[] args) {
        String word = "Ahmet";
        String word1 = "Ahmetie";
        Trie trie = new Trie();

        trie.insert(word);
        trie.insert(word1);

        trie.printWords();

        trie.remove(word1);

        System.out.println("======================================");

        trie.printWords();




    }
}