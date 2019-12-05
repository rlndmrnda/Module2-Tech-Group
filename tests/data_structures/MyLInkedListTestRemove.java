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
    public void ShouldDecreaseSizeWhenRemoveElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        int expectedSize = 2;
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.remove("test1");
        int actualSize = myLinkedList.size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void ShouldSizeEqualsToZeroWhenRemoveOnlyElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        int expectedSize = 0;
        myLinkedList.add("test1");
        myLinkedList.remove("test1");
        int actualSize = myLinkedList.size();
        assertEquals(expectedSize, actualSize);
    }

    @Test
    public void ShouldContainsReturnFalseWhenRemoveElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.remove("test2");
        assertFalse(myLinkedList.contains("test2"));
    }
    @Test
    public void ShouldContainsReturnFalseWhenRemoveLastElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.remove("test1");
        assertFalse(myLinkedList.contains("test1"));
    }
    @Test
    public void ShouldReturnTrueIfRemoveElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        assertTrue(myLinkedList.remove("test1"));
    }
    @Test
    public void ShouldReturnFalseIfRemoveNonExistentElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        assertFalse(myLinkedList.remove("test2"));
    }
    @Test
    public void ShouldReturnElementIfRemoveByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        assertEquals("test2",myLinkedList.remove(1));
    }
    @Test
    public void ShouldReturnElementIfRemoveFirstByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        assertEquals("test1",myLinkedList.remove(0));
    }
    @Test
    public void ShouldReturnElementIfRemoveLastByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        assertEquals("test3",myLinkedList.remove(2));
    }
    @Test
    public void ShouldReturnElementIfRemoveOnlyElementByIndex() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        assertEquals("test1",myLinkedList.remove(0));
    }
    @Test
    public void testClear() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.clear();
        Assert.assertTrue(myLinkedList.isEmpty());
    }
}
