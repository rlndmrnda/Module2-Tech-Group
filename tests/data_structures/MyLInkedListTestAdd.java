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
public class MyLInkedListTestAdd {
    @Test
    public void ShouldIncreaseSizeWhenAddElements() {
        MyLinkedList myLinkedList = new MyLinkedList();
        int expectedSize = 3;
        myLinkedList.add("test1");
        myLinkedList.add("test2");
        myLinkedList.add("test3");
        assertEquals(expectedSize, myLinkedList.size());
    }
}
