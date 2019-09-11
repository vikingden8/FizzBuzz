package com.pingan.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class GameTest {

    private List<GameRule> gameRules ;

    @BeforeEach
    void setUp(){
        gameRules = new ArrayList<>() ;
        gameRules.add(new GameRule(3, "Fizz")) ;
        gameRules.add(new GameRule(5, "Buzz")) ;
        gameRules.add(new GameRule(7, "Whizz")) ;
    }

    @Test
    void should_return_1_when_mismatch_any_random_number(){
        assertEquals(Student.countOff(1, gameRules), "1");
    }

    @Test
    void should_return_fizz_when_just_a_multiple_of_the_second_random(){
        assertEquals(Student.countOff(3, gameRules), "Fizz");
    }

    @Test
    void should_return_buzz_when_just_a_multiple_of_the_first_random(){
        assertEquals(Student.countOff(5, gameRules), "Buzz");
    }

    @Test
    void should_return_whizz_when_just_a_multiple_of_the_third_random(){
        assertEquals(Student.countOff(7, gameRules), "Whizz");
    }


}
