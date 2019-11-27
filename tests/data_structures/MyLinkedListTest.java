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
    public void testIsEmpty(){
        MyLinkedList myLinkedList = new MyLinkedList();
        Assert.assertTrue(myLinkedList.isEmpty());
    }
    @Test
    public void testContains(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test");
        Assert.assertTrue(myLinkedList.contains("test"));
    }
    @Test
    public void testToArray(){
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        Object[] items = myLinkedList.toArray();
        Assert.assertTrue(items[0].toString().equals("test1") && items[1].toString().equals(("test2")) );
    }
    
}
