package data_structures;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class MyLinkedListTestContains {
    @Test
    public void ShouldReturnTrueIfContainsElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test 1");
        myLinkedList.add("test 2");
        myLinkedList.add("test 3");
        Assert.assertTrue(myLinkedList.contains("test 2"));
    }

    @Test
    public void ShouldReturnTrueIfContainsElementInListWithSingleElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test 1");
        Assert.assertTrue(myLinkedList.contains("test 1"));
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
    public void ShouldContainsReturnFalseWhenRemoveElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.remove("test2");
        assertFalse(myLinkedList.contains("test2"));
    }

    @Test
    public void ShouldContainsReturnFalseWhenRemoveOnlyElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.remove("test1");
        assertFalse(myLinkedList.contains("test1"));
    }

    @Test
    public void ShouldContainsReturnFalseWhenRemoveFirstElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.remove("test1");
        assertFalse(myLinkedList.contains("test1"));
    }

    @Test
    public void ShouldContainsReturnFalseWhenRemoveLastElement() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        myLinkedList.remove("test3");
        assertFalse(myLinkedList.contains("test3"));
    }

    @Test
    public void ShouldReturnsTrueIfContainsCollection() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        Collection collection = new ArrayList();
        collection.add("test1");
        collection.add("test3");
        assertTrue(myLinkedList.containsAll(collection));
    }

    @Test
    public void ShouldReturnsFalseIfNotContainsCollection() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        Collection collection = new ArrayList();
        collection.add("test4");
        collection.add("test3");
        assertFalse(myLinkedList.containsAll(collection));
    }
}
