package com.datastructures.userdefined;;

public class UserHashMap<K, V> {
    private class Entry {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public String toString() {
            return "key: " + key + ", value: " + value;
        }
    }

    private Object[] hTable;
    private int size;

    public UserHashMap() {
        hTable = new Object[10];
        size = 10;
    }

    public UserHashMap(int n) {
        hTable = new Object[n];
        size = n;
    }

    public boolean put(K key, V value) {
        int index = hash(key);
        if (index == -1)
            return false;
        if (hTable[index] == null) {
            // No collision
            hTable[index] = new Entry(key, value);
        } else {
            index = linearProbe(index);
            if (index == -1)
                return false;
            else
            	hTable[index] = new Entry(key, value);
        }
        return true;
    }

    private int hash(K key) {
        if (key.getClass().getSimpleName().equals("Integer")) {
            // If it's an integer
            return ((Integer) key) % size;
        } else if (key.getClass().getSimpleName().equals("String")) {
            // If it's a String
            return key.toString().codePointAt(0) % size; // Returns the character at the specified index
        } else {
            return -1;
        }
    }

    private int linearProbe(int index) {
        for (int i = 1; i < size; i++) {
            int newIndex = (index + 1) % size;
            if (hTable[newIndex] == null)
                return newIndex;
        }
        return -1;
    }

    public V get(K key) {
        int index = hash(key);
        Entry ele = (Entry) hTable[index];
        if (ele != null && key.equals(ele.key))
            return ele.value;
        else {
            for (int i = 1; i < size; i++) {
                int newIndex = (index + i) % size;
                ele = (Entry) hTable[newIndex];
                if (ele != null && key.equals(ele.key))
                    return ele.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        int index = hash(key);
        Entry ele = (Entry) hTable[index];
        if (ele != null && key.equals(ele.key)) {
            hTable[index] = null;
            return ele.value;
        } else {
            for (int i = 1; i < size; i++) {
                int newIndex = (index + i) % size;
                ele = (Entry) hTable[newIndex];
                if (ele != null && key.equals(ele.key)) {
                    hTable[newIndex] = null;
                    return ele.value;
                }
            }
        }
        return null;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            if (hTable[i] != null) {
                System.out.println(i + " " + hTable[i]);
            }
        }
    }

}