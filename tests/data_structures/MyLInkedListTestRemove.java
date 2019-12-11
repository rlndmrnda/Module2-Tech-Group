package data_structures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class MyLInkedListTestRemove {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

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
    public void ShouldReturnTrueWhenRemoveOnlyElement() {
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
    public void ShouldUpdateFirstIfRemoveByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        Object removedElement = myLinkedList.remove(0);
        int expectedSize = 2;
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("test1", removedElement);
        assertEquals(myLinkedList.getFirst().getValue(), "test2");
    }

    @Test
    public void ShouldUpdateLastIfRemoveLastByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        Object removedObject = myLinkedList.remove(2);
        int expectedSize = 2;
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("test3", removedObject);
        assertEquals(myLinkedList.getLast().getValue(), "test2");
    }

    @Test
    public void ShouldReturnElementIfRemoveOnlyElementByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        Object removedObject = myLinkedList.remove(0);
        int expectedSize = 0;
        assertEquals("test1", removedObject);
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals(null, myLinkedList.getFirst());
        assertEquals(null, myLinkedList.getLast());
    }

    @Test
    public void ShouldReturnExceptionIfRemoveIndexGreaterThanSize() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        exception.expect(IndexOutOfBoundsException.class);
        Object removedObject = myLinkedList.remove(1);
    }

    @Test
    public void ShouldRemoveCollection() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        Collection collection = new ArrayList();
        collection.add("test1");
        collection.add("test3");
        myLinkedList.removeAll(collection);
        int expectedSize = 1;
        assertEquals(expectedSize, myLinkedList.size());
        assertEquals("test2", myLinkedList.get(0));
    }

}
