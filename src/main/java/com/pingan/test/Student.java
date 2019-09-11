package com.pingan.test;

import java.util.List;

public class Student {

    public static String countOff(Integer num, List<GameRule> gameRules) {
        if (num % gameRules.get(0).getNumber() == 0){
            return gameRules.get(0).getTerm() ;
        }
        return num.toString() ;
    }
}
