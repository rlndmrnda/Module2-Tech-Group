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
import java.util.Iterator;

public class MyLinkedListTest {
    @Test
    public void ShouldReturnTrueIfListEmpty() {
        MyLinkedList myLinkedList = new MyLinkedList();
        assertTrue(myLinkedList.isEmpty());
    }

    @Test
    public void ShouldReturnFalseIfListNotEmpty() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(new Object());
        assertFalse(myLinkedList.isEmpty());
    }


    @Test
    public void ShouldReturnArrayWhenListHasElements() {
        MyLinkedList myLinkedList = new MyLinkedList();
        Object[] expectedElements = {"test 1", "test 2", "test 3"};
        myLinkedList.add(expectedElements[0]);
        myLinkedList.add(expectedElements[1]);
        myLinkedList.add(expectedElements[2]);
        Object[] actualElements = myLinkedList.toArray();
        assertTrue(Arrays.deepEquals(expectedElements, actualElements));
    }

    @Test
    public void ShouldReturnArrayWhenListHasASingleElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        Object[] expectedElements = {"test 1"};
        myLinkedList.add(expectedElements[0]);
        Object[] actualElements = myLinkedList.toArray();
        assertTrue(Arrays.deepEquals(expectedElements, actualElements));
    }

    @Test
    public void ShouldReturnEmptyArrayWhenListIsEmpty() {
        MyLinkedList myLinkedList = new MyLinkedList();
        Object[] expectedElements = new Object[0];
        Object[] actualElements = myLinkedList.toArray();
        assertTrue(Arrays.deepEquals(expectedElements, actualElements));
    }

    @Test
    public void ShouldReturnIterator() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("element 1");
        myLinkedList.add("element 2");
        myLinkedList.add("element 3");
        Iterator iterator = myLinkedList.iterator();
        int i = 1;
        while (iterator.hasNext()) {
            Object element = iterator.next();
            assertEquals("element " + i, element);
            i++;
        }
    }

    @Test
    public void testClear() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.clear();
        Assert.assertTrue(myLinkedList.isEmpty());
    }
}
