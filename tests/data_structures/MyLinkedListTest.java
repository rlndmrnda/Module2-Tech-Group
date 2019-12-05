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
    public void ShouldReturnTrueIfContainsElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test 1");
        myLinkedList.add("test 2");
        myLinkedList.add("test 3");
        assertTrue(myLinkedList.contains("test 2"));
    }

    @Test
    public void ShouldReturnTrueIfContainsElementInListWithSingleElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test 1");
        assertTrue(myLinkedList.contains("test 1"));
    }

    @Test
    public void ShouldReturnFalseIfNotContainsElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test 1");
        myLinkedList.add("test 2");
        myLinkedList.add("test 3");
        assertFalse(myLinkedList.contains("test 4"));
    }

    @Test
    public void ShouldReturnFalseIfNotContainsElementInListWithSingleElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test 1");
        assertFalse(myLinkedList.contains("test 2"));
    }

    @Test
    public void ShouldReturnFalseIfNotContainsElementInEmptyList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        assertFalse(myLinkedList.contains("test 2"));
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

}
