package com.company;

public class Node<T> {
    private T data;
    private Node next;
    private Node prev;

    Node() {
        next = null;
        prev = null;
        data = null;
    }

    Node(T data) {
        this(data, null, null);
    }

    Node(T data, Node<T> next, Node<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public T getData() {
        return data;
    }

    public void setNextNode(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrevNode() {
        return prev;
    }

    public void setPrevNode(Node<T> prev) {
        this.prev = prev;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return this.next;
    }
}
