package com.company.questions.chapter_1_hash;

import com.sun.xml.internal.fastinfoset.util.CharArray;

/**
 * Created by michaeljames on 08/08/2018.
 */
public class QuestionThree_URLify {

    public static String run(char[] input, int trueLength){

        int end = input.length-1;
        for(int i = trueLength; i >= 0; i--) {
            if (input[i] == ' ') {
                input[end] = '0';
                end--;
                input[end] = '2';
                end--;
                input[end] = '%';
                end--;
            } else {
                input[end] = input[i];
                end--;
            }
        }
        return input.toString();
    }
}
