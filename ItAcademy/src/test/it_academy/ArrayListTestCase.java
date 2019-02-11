package it_academy;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Created by user on 11.02.2019.
 */
public class ArrayListTestCase {
    @Test
    public void addListToElements(){
        ArrayList <Integer> somelist = new ArrayList<>();
        somelist.add(1);
        somelist.add(5);
        somelist.add(6);
        somelist.add(7);
        somelist.add(8);
        somelist.add(13);
        somelist.add(9);
        Assert.assertEquals(9, somelist.size());

    }
    @Test
    public void removeListElements(){
        ArrayList <Integer> somelist = new ArrayList<>();
        somelist.add(1);
        somelist.add(5);
        somelist.remove(0);
        Assert.assertEquals(2, somelist.size());
    }
    @Test
    public void findNull(){
        ArrayList <Integer> somelist = new ArrayList<>();
        somelist.add(1);
        somelist.add(3);
        somelist.add(null);
        Assert.assertNull(somelist);
    }

    @Test
    public void compareTwoArrays(){
        ArrayList <Integer> somelist1 = new ArrayList<>();
        somelist1.add(8);
        somelist1.add(13);
        somelist1.add(9);

        ArrayList <Integer> somelist2 = new ArrayList<>();
        somelist2.add(null);
        somelist2.add(null);
        somelist2.add(null);
        Assert.assertSame(somelist1, somelist2);
    }
    @Test
    public void compare(){
        List<String> strings = Arrays.asList("AAA", "BBB", "CCC", "AAA", "DDD");

        Set<String> hashSet16 = new HashSet<>(16, 1);
        hashSet16.addAll(strings);

        Set<String> hashSet64 = new HashSet<>(64, 1);
        hashSet64.addAll(strings);

        System.out.println(hashSet16);
        System.out.println(hashSet64);

        Assert.assertSame("[AAA, CCC, BBB, DDD]", strings);
    }

}
