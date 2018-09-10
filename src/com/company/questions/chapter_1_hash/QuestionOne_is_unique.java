package com.company.questions.chapter_1_hash;

import java.util.ArrayList;

/**
 * Created by michaeljames on 08/08/2018.
 */
public class QuestionOne_is_unique {


    public static boolean run(String input){
        if (input.length() > 128)
            return false;
        ArrayList<Integer> arr = new ArrayList<Integer>(128); // assuming ascii characters

        for(char c : input.toCharArray()){
            if(arr.get(c) == 1)
                return false;
            arr.set(c, 1);
        }
        return true;
    }
}
