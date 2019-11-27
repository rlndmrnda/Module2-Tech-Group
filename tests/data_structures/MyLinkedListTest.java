package data_structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class MyLinkedListTest {
    @Test
    public void testIsEmpty() {
        MyLinkedList myLinkedList = new MyLinkedList();
        Assert.assertTrue(myLinkedList.isEmpty());
    }

    @Test
    public void testContains() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test");
        Assert.assertTrue(myLinkedList.contains("test"));
    }

    @Test
    public void testToArray() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        Object[] items = myLinkedList.toArray();
        Assert.assertTrue(items[0].toString().equals("test1") && items[1].toString().equals(("test2")));
    }

    @Test
    public void testAdd() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        Assert.assertTrue(myLinkedList.size() == 1 && myLinkedList.get(0).equals("test1"));
    }

    @Test
    public void testRemove() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.remove("test1");
        Assert.assertTrue(myLinkedList.isEmpty());
    }

    @Test
    public void testClear() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.clear();
        Assert.assertTrue(myLinkedList.isEmpty());
    }

}
