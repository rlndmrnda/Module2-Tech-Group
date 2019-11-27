package data_structures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<T> implements List<T> {

    private Node first;
    private Node last;
    private Integer size;

    public Node getFirst() {
        return first;
    }

    public void setFirst(Node first) {
        this.first = first;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    //done
    @Override
    public int size() {
        return size;
    }

    //done
    @Override
    public boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

    //done
    @Override
    public boolean contains(Object o) {
        Node current = first;
        while (current != null) {
            if (current.getValue().equals(o)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    //pending
    @Override
    public Iterator iterator() {
        return null;
    }

    //done
    @Override
    public Object[] toArray() {
        Object[] objects = new Object[size];
        if (!isEmpty()) {
            Node current = first;
            for (int i = 0; i < size; i++) {
                objects[i] = current.getValue();
                current = current.getNext();
            }
        }
        return objects;
    }

    //done
    @Override
    public boolean add(Object o) {
        Node newNode = new Node(o);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.setNext(newNode);
            last = newNode;
        }
        return true;
    }

    //pending validations
    @Override
    public boolean remove(Object o) {
        if (!isEmpty()) {
            Node current = first;
            Node previous = first;
            for (int i = 0; i < size; i++) {
                if (current.getValue().equals(o)) {
                    if (first == current) {
                        first = current.getNext();
                    }
                    if (last == current) {
                        last = previous;
                    }
                    previous.setNext(current.getNext());
                    current.setNext(null);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    //done
    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

    @Override
    public T get(int index) {
        if (!isEmpty()) {
            Node<T> current = first;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            return current.getValue();
        }
        return null;
    }

    @Override
    public Object set(int index, Object element) {
        if (!isEmpty()) {
            Node current = first;
            Object oldElement;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            oldElement = current.getValue();
            current.setValue(element);
            return oldElement;
        }
        return null;
    }

    @Override
    public void add(int index, Object element) {
        if (!isEmpty()) {
            Node newNode = new Node(element);
            Node current = first;
            Node previous = first;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
            newNode.setNext(current);
            if (current == first) {
                first = newNode;
            }
            previous.setNext(newNode);
        }
    }

    @Override
    public T remove(int index) {
        if (!isEmpty()) {
            Node<T> current = first;
            Node<T> previous = first;
            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(current.getNext());
            current.setNext(null);
            return current.getValue();
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.getValue().equals(o)) {
                return i;
            }
            current = current.getNext();
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        MyLinkedList sublist = new MyLinkedList();
        Node first = new Node(get(fromIndex));
        Node last = new Node(get(toIndex));
        sublist.setFirst((first));
        sublist.setLast((last));
        return sublist;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
