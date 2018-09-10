package com.company.chapter_2_linked;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by michaeljames on 02/09/2018.
 */
public class QuestionTwo_kth_to_last {



    public static Integer run(LinkedList<Integer> list, int k){

        // Order of (n)
        int kth = 0;
        for(int i=0; i < list.size(); i++){
            if(k > 0){
                k --;
            } else {
                kth++;
            }

        }


        return list.get(kth);
    }
}
