package data_structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class MyLInkedListTestRemove {

    @Test
    public void ShouldReturnTrueIfRemoveElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        boolean isRemoved = myLinkedList.remove("test1");
        int expectedSize = 2;
        assertEquals(expectedSize, myLinkedList.size());
        assertTrue(isRemoved);
    }

    @Test
    public void ShouldReturnFalseIfRemoveNonExistentElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test3");
        boolean isRemoved = myLinkedList.remove("test2");
        int expectedSize = 2;
        assertEquals(expectedSize, myLinkedList.size());
        assertFalse(isRemoved);
    }

    @Test
    public void ShouldUpdateFirstWhenRemoveFirstElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        boolean isRemoved = myLinkedList.remove("test1");
        int expectedSize = 2;
        assertEquals(expectedSize, myLinkedList.size());
        assertTrue(isRemoved);
        assertEquals(myLinkedList.getFirst().getValue(), "test2");
    }

    @Test
    public void ShouldUpdateLastWhenRemoveLastElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        boolean isRemoved = myLinkedList.remove("test3");
        int expectedSize = 2;
        assertEquals(expectedSize, myLinkedList.size());
        assertTrue(isRemoved);
        assertEquals(myLinkedList.getLast().getValue(), "test2");
    }
    @Test
    public void ShouldTrueWhenRemoveOnlyElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        int expectedSize = 0;
        myLinkedList.add("test1");
        boolean isRemoved = myLinkedList.remove("test1");
        int actualSize = myLinkedList.size();
        assertEquals(expectedSize, actualSize);
        assertEquals(null, myLinkedList.getFirst());
        assertEquals(null, myLinkedList.getLast());
        assertTrue(isRemoved);
    }

    @Test
    public void ShouldReturnElementIfRemoveByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        Object removedElement = myLinkedList.remove(1);
        int expectedSize = 2;
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("test2", removedElement);
    }

    @Test
    public void ShouldReturnElementIfRemoveFirstByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        Object removedElement = myLinkedList.remove(0);
        int expectedSize = 2;
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("test1", removedElement);
    }

    @Test
    public void ShouldReturnElementIfRemoveLastByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        assertEquals("test3", myLinkedList.remove(2));
    }

    @Test
    public void ShouldReturnElementIfRemoveOnlyElementByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        assertEquals("test1", myLinkedList.remove(0));
    }

    @Test
    public void testClear() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.clear();
        Assert.assertTrue(myLinkedList.isEmpty());
    }
}
