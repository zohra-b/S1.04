package org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertThrows;


public class Ex6_OutOfBoundsTest {
    String[] myList = new String[5];

    @BeforeEach
    void setUp(){
        myList[0] = "Milk";
        myList[1] = "Meat";
        myList[2] = "Bread";
        myList[3] = "Marmelade";
        myList[4] = "Honey";
    }

    @Test
    void throwException(){
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> System.out.println(myList[5] ));
    }
}
