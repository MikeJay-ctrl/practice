package com.company.chapter_2_linked;

import java.util.*;

/**
 * Created by michaeljames on 04/09/2018.
 */
public class QuestionOne_remove_duplicates {


    // question 1a
    public static void run (LinkedList<Integer> list){

        // Order of (n)
        HashSet<Integer> duplicates = new HashSet<Integer>();
        ListIterator<Integer> it = list.listIterator();

        while( it.hasNext() ){
            int val = it.next();
            if(duplicates.contains(val)){
                it.remove();
            } else {
                duplicates.add(val);
            }
        }

        System.out.println(list);
    }



    public static void run_b (LinkedList<Integer> list) {

        // Order of n log(n)
        list.sort(Integer::compareTo);

        ListIterator<Integer> it = list.listIterator(0);
        while(it.hasNext()){
            int val = it.next();
            if(val == it.previous())
                it.remove();
        }
        System.out.println(list);
    }

}
