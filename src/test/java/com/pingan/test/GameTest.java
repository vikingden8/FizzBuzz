package com.pingan.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class GameTest {

    @Test
    public void should_return_fizz_when_just_a_multiple_of_the_first_random(){
        List<GameRule> gameRules = new ArrayList<>() ;
        assertEquals(Student.countOff(3, gameRules), "Fizz");
    }
}
