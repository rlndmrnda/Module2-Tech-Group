package data_structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyLInkedListTestAdd {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void ShouldReturnTrueWhenAddElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        int expectedSize = 3;
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        boolean isAdded = myLinkedList.add("test3");
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("test3", myLinkedList.getLast().getValue());
        assertTrue(isAdded);
    }

    @Test
    public void ShouldAddElementByIndexAtTheMiddle() {
        MyLinkedList myLinkedList = new MyLinkedList();
        int expectedSize = 5;
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.add("test4");
        myLinkedList.add(2, "test5");
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("test5", myLinkedList.get(2));
    }

    @Test
    public void ShouldAddElementByIndexAtTheStart() {
        MyLinkedList myLinkedList = new MyLinkedList();
        int expectedSize = 3;
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add(0, "test3");
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("test3", myLinkedList.getFirst().getValue());
        assertEquals("test1", myLinkedList.getFirst().getNext().getValue());
    }

    @Test
    public void ShouldAddElementByIndexAtTheEnd() {
        MyLinkedList myLinkedList = new MyLinkedList();
        int expectedSize = 4;
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.add(3, "test4");
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("test4", myLinkedList.getLast().getValue());
    }

    @Test
    public void ShouldThrowExceptionIfAddAtIndexGreaterThanSize() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        exception.expect(IndexOutOfBoundsException.class);
        myLinkedList.add(4, "test4");
    }

    @Test
    public void ShouldThrowExceptionIfAddByIndexInEmptyList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        exception.expect(IndexOutOfBoundsException.class);
        myLinkedList.add(0, "test1");
    }

    @Test
    public void ShouldAddCollectionByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        Collection collection = new ArrayList();
        collection.add("element 1");
        collection.add("element 2");
        myLinkedList.addAll(1, collection);
        int expectedSize = 4;
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("element 1", myLinkedList.get(1));
        assertEquals("element 2", myLinkedList.get(2));
    }

    @Test
    public void ShouldAddCollection() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        Collection collection = new ArrayList();
        collection.add("element 1");
        collection.add("element 2");
        myLinkedList.addAll(collection);
        int expectedSize = 4;
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("element 1", myLinkedList.get(2));
        assertEquals("element 2", myLinkedList.get(3));
    }


    @Test
    public void ShouldThrowExceptionIfAddAllByIndexExceedsSize() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        Collection collection = new ArrayList();
        collection.add("element 1");
        exception.expect(IndexOutOfBoundsException.class);
        myLinkedList.addAll(2, collection);
    }

}
