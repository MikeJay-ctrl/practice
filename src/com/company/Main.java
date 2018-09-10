package com.company;

import com.company.chapter_2_linked.MyLinkedList;
import com.company.chapter_2_linked.QuestionOne_remove_duplicates;
import com.company.chapter_2_linked.QuestionThree_delete_middle_node;
import com.company.chapter_2_linked.QuestionTwo_kth_to_last;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here

/*        MyLinkedList<Integer> ll = new MyLinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(1);
        ll.add(5);

        ll.remove(1);
        System.out.println(ll);



        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(1);
        ll2.add(2);
        ll2.add(3);
        ll2.add(1);
        ll2.add(5);

        System.out.println(QuestionTwo_kth_to_last.run(ll2,3));
        ll2.remove(1);
        System.out.println(ll2);*/


        //QuestionOne_remove_duplicates.run(new LinkedList(Arrays.asList(1,2,3,4,5,6,7,7,8,9,4)));
        //QuestionOne_remove_duplicates.run(new LinkedList(Arrays.asList(19,9,4,2,6,9,4,5,2,1,3,1)));
        QuestionThree_delete_middle_node.run(new LinkedList(Arrays.asList(1,2,3,4,5,6,7,8,9,10)));

    }
}
