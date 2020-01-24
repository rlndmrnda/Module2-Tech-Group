package com.company;

public class Main {

    public static void main(String[] args) {
        HashTable ht = new HashTable(1000);
        ht.add(1);
        ht.add(2);
        ht.add(3);
        ht.add(4);
        ht.add(5);
        ht.add(6);
        ht.add(7);
        ht.add(8);
        ht.add(9);
        ht.add(10);
        ht.add(1);
        ht.add(2);
        ht.add(3);
        ht.add(4);
        ht.add(5);
        ht.add(6);
        ht.add(7);
        ht.add(8);
        ht.add(9);
        ht.add(10);
        ht.print();
        System.out.println(ht.remove(5));
        //System.out.println(ht.remove(4));
        ht.print();
    }
}
