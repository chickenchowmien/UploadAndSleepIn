package com.dice.tests;

import org.junit.Test;

import java.util.*;

public class Collect {

    @Test
    public void first(){
        Integer[] numbers = {1,2,3,4,5,5};
        String []  strings = {"one", "two", "three"};

        System.out.println(strings.length+" array size!!!!");

        List<String> list = new ArrayList(Arrays.asList(strings));

        System.out.println(list.size()+"size!!!!");

        //Set set = new HashSet();
       // Set set = new HashSet(Arrays.asList(numbers));
        Set set = new LinkedHashSet<>(Arrays.asList(numbers));
        //set.addAll(Arrays.asList(numbers));
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
