package data_structures;

import java.util.*;

public class MyLinkedList<T> implements List<T> {

    private Node first;
    private Node last;
    private Integer size;

    public MyLinkedList() {
        size = 0;
        first = last = null;
    }

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

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size > 0) {
            return false;
        }
        return true;
    }

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

    @Override
    public Iterator iterator() {
        return null;
    }

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
            return false;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        if (!c.isEmpty()) {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                add(iterator.next());
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean addAll(int index, Collection c) {
        if (!c.isEmpty()) {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                add(index++, iterator.next());
            }
            return true;
        } else {
            return false;
        }
    }

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
        Node current = last;
        int position = -1;
        for (int i = 0; i < size; i++) {
            if (current.getValue().equals(o)) {
                position = i;
            }
            current = current.getNext();
        }
        return position;
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
        if (containsAll(c)) {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                remove(iterator.next());
            }
            return true;
        } else {

            return false;
        }
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean containsCollection = false;
        if (!c.isEmpty()) {
            Iterator iterator = c.iterator();
            while (iterator.hasNext()) {
                containsCollection = contains(iterator.next());
                if (containsCollection == false) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Object[] toArray(Object[] a) {
        if(a.length == size){
            a = toArray();
            return a;
        }
        else if(a.length > size){
            Object[] myListArray = toArray();
            a = Arrays.copyOf(myListArray, a.length);
            return a;
        } else{
            return toArray();
        }
    }
}
