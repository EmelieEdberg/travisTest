package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

      @BeforeClass
      public static void beforeClass(){  //First of all
        System.out.println("Before class");
      }

      @AfterClass
      public static void afterClass(){  // Last of all
        System.out.println("After class");
      }

      @Before
      public void before(){  //Before each test method
        System.out.println("Before");
      }

      @After
      public void after(){  //After each test method
        System.out.println("After");
      }
      
    @Test
    public void testAdd() {
        List l = new List();
        l.add(1);                        // Call method to test
        assertEquals(l.getLength(), 1);  // The logical check
    }

    @Test
    public void testRemove(){
        List l = new List();
        l.add(8);
        int returned = l.remove();
        assertEquals(returned, 8);
    }

    @Test
    public void testRemove2(){
        List l = new List();
        l.add(8);
        int returned = l.remove();
        assertEquals(0, l.getLength());
    }

    @Test
    public void testGet(){
        List l = new List();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        int returned = l.get(3);
        assertEquals(3, returned);
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
      List list = new List();
      list.get(-1); // Exception!!!
    }

    @Test
    public void testCopy(){
        List l = new List();
        l.add(20);
        l.add(30);
        List j = l.copy();
        assertEquals(j, l); // bad
    }

}




















