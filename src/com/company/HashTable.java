package com.company;

public class HashTable {
    private static int EMPTY_VALUE = 0;
    private static int DELETED_VALUE = 1;
    private static int FILLED_VALUE = 2;

    private int tableSize;
    int[] Arr;
    int[] Flag;

    public HashTable(int tSize) {
        tableSize = tSize;
        Arr = new int[tSize + 1];
        Flag = new int[tSize + 1]; // flag value 0 is considered empty.
    }

    int computeHash(int key) {
        return key % tableSize;
    }

    //To solve a collision searching next available index free
    int resolverLin(int index) {
        return index;
    }

    /*int resolverLin(int i) {
        return i * i;
    }*/

    boolean add(int value) {
        int hashValue = computeHash(value);
        for (int i = 0; i < tableSize; i++) {
            if (Flag[hashValue]==EMPTY_VALUE || Flag[hashValue]==DELETED_VALUE) {
                Arr[hashValue] = value;
                Flag[hashValue] = FILLED_VALUE;
                return true;
            }
            hashValue += resolverLin(i);
            hashValue %= tableSize;
        }
        return false;
    }

    boolean find(int value) {
        int hashValue = computeHash(value);
        for (int i = 0; i < tableSize; i++) {
            if (Flag[hashValue] == EMPTY_VALUE) {
                return false;
            }
            if (Flag[hashValue] == FILLED_VALUE && Arr[hashValue] == value) {
                return true;
            }
            hashValue += resolverLin(i);
            hashValue %= tableSize;
        }
        return false;
    }

    boolean remove(int value) {
        int hashValue = computeHash(value);
        for (int i = 0; i < tableSize; i++) {
            if (Flag[hashValue] == EMPTY_VALUE) {
                return false;
            }
            if (Flag[hashValue] == FILLED_VALUE && Arr[hashValue] == value) {
                Flag[hashValue] = DELETED_VALUE;
                return true;
            }
            hashValue += resolverLin(i);
            hashValue %= tableSize;
        }
        return false;
    }

    void print() {
        for (int i = 0; i < tableSize; i++) {
            if (Flag[i] == FILLED_VALUE) {
                System.out.println("Node at index [" + i + "] :: " + Arr[i]);
            }
        }
    }
}