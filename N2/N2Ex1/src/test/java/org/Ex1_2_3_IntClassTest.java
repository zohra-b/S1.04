package org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex1_2_3_IntClassTest {
    Ex1_2_3_IntClass myInt1;
    Ex1_2_3_IntClass myInt2;
    Ex1_2_3_IntClass myInt3;
    Ex1_2_3_IntClass myInt4;
    Integer[] array1 = {158,222,389};
    Integer[] array2 = {158,222,389};
    Integer[] array3 = {158,222,3};

    @BeforeEach
    void setUp() {
    myInt1 = new Ex1_2_3_IntClass(150);
    myInt2 = new Ex1_2_3_IntClass(12);
    myInt3 = new Ex1_2_3_IntClass(150);
    myInt4 = myInt1;

    }

    @Test
    void objectsAreEquals(){
        assertEquals(myInt1, myInt3);
    }
    @Test
    void objectsAreNotEquals(){
        assertNotEquals(myInt1, myInt2);
    }

    @Test
    void objetsHaveSameReference(){
        assertSame(myInt1, myInt4);
    }
    @Test
    void objetsHaveNotSameReference(){
        assertNotSame(myInt1, myInt3);
    }

    @Test
    void arraysAreEquals(){
        assertArrayEquals(array1, array2, "Array1 and Array2 are equals");
    }


}