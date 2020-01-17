package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;


public class MyDoublyLinkedList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;
    private Integer size;


    public MyDoublyLinkedList(){
        first =null;
        last =null;
        size=0;
    }
    //insert element at front of the list

    public void insertFront(T data){
        System.out.println("Inserting data at front: " + data);
        Node<T> node = new Node<T>(data);
        if(first ==null && last ==null){
            first=node;
            last=node;
            size++;
            return;
        }
        node.getNextNode()= first;
        first.getPrevNode()=node;
        first=node;
        size++;
    }

    //add elements at the back of the list.
    public void insertBack(T data){
        System.out.println("Inserting data at back  : " + data);
        Node<T> node = new Node<T>(data);
        if(last==null && first ==null){
            first =node;
            last =node;
            size++;
            return;
        }
        last.getNextNode()= node;
        node.getPrevNode()= last;
        last=node;
        size++;
    }

    //remove element from the front of the list.
    public void removeFront() throws Exception{
        System.out.println("Remove Front Operation");
        if(first ==null && last ==null){
            throw new Exception("List is empty");
        }
        if(first == last){
            first =null;
            last =null;
            size--;
            return;
        }

        first.getNextNode()=null;
        first.getPrevNode()=null;
        first = first.getNextNode();
        size--;
    }

    //remove elements from the back of the list.
    public void removeBack() throws Exception{
        System.out.println("Remove Back Operation");
        if(first ==null && last ==null){
            throw new Exception("List is empty");
        }
        if(first == last){
            first =null;
            last =null;
            size--;
            return;
        }
        last.getPrevNode()=null;
        last.getNextNode()=null;
        last = last.getPrevNode();
        size--;
    }

    //to get the first element  of the list.

    public T getFront() throws Exception{
        if(first ==null){
            throw new Exception("List is empty");
        }
        return first.getData();
    }

    //to get last element of the list.
    public T getBack() throws Exception{
        if(last ==null){
            throw new Exception("List is empty");
        }
        return last.getData();
    }

    //function to find specific element in the list.

    public boolean Find(T data){
        Node temp= first;
        while(temp!=null){
            if(temp.getData()==data){
                return true;
            }
            temp=temp.getNextNode();
        }
        return false;
    }

    //function to get size of the list.
    @Override
    public int size(){
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] t1s) {
        return null;
    }

    @Override
    public boolean add(T t) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean addAll(int i, Collection<? extends T> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public T set(int i, T t) {
        return null;
    }

    @Override
    public void add(int i, T t) {

    }

    //display the list.
    public void Display() throws Exception{
        System.out.print("List: ");
        Node temp = first;
        if(temp==null){
            throw new Exception("List is empty");
        }
        while(temp!=null){
            System.out.print(temp.getData() + " ");
            temp=temp.getNextNode();
        }
        System.out.println();
    }


    //remove specific element from the list.
    public void remove(T data) throws Exception{
        System.out.println("Remove data: " + data);
        Node temp = first;
        Node prevNode = null;
        if(temp==null){
            throw new Exception("List is empty");
        }
        size--;

        if(temp== last){
            if(temp.getData()==data){
                first =null;
                last =null;
                return;
            }
            else{
                throw new Exception("Data not found");
            }
        }
        if(first.getData()==data){
            first = first.getNextNode();
            first.getPrevNode()=null;
            return;
        }
        while(temp!=null && temp.getData()!=data){
            prevNode=temp;
            temp=temp.setNextNode();
        }
        prevNode.getNextNode()=prevNode.getNextNode().getNextNode();
        prevNode.getNextNode().getPrevNode()=prevNode;
        temp=null;
    }

}