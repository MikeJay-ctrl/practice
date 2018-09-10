package com.company.chapter_2_linked;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by michaeljames on 09/09/2018.
 */
public class QuestionThree_delete_middle_node {


    public static void run(LinkedList<Integer> list){

        // Order of (n)
        ListIterator<Integer> fast = list.listIterator(0);
        ListIterator<Integer> slow = list.listIterator(0);

        while(fast.hasNext()){
            fast.next();
            fast.next();
            slow.next();
        }

        System.out.println(list);
        System.out.println("Middle value = [ " + slow.previous() + " ]");
        slow.remove();
        System.out.println(list);

    }
}
