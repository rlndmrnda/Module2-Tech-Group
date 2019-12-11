package data_structures;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class MyLinkedListTestContains {

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

}
