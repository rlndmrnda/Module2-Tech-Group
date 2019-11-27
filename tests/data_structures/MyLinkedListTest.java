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
    
}
