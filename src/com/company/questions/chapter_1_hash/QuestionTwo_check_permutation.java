package com.company.questions.chapter_1_hash;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by michaeljames on 08/08/2018.
 */
public class QuestionTwo_check_permutation {


    // O nlog(n)
    public static boolean run(String inputA, String inputB){
        if(inputA.length() != inputB.length())
            return false;

        char[] arrA = inputA.toCharArray();
        char[] arrB = inputB.toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);


        for(int i = 0; i < inputA.length(); i++){
            if(arrA[i] != arrB[i])
                return false;
        }
        return true;
    }



    // O(n)
    public static boolean runB(String inputA, String inputB){
        if(inputA.length() != inputB.length())
            return false;

        ArrayList<Integer> index = new ArrayList<Integer>(inputA.length());

        for(int i=0; i < index.size(); i++ ){
            index.set(inputA.charAt(i), 1);
            index.set(inputB.charAt(i), -1);
        }

        for(int element : index){
            if(element != 0)
                return false;
        }
        return true;
    }
}
