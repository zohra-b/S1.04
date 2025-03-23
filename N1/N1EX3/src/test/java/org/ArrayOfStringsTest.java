package org;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayOfStringsTest {
    ArrayOfStrings myArray;

    @BeforeEach
    void setUp() {
    myArray =new ArrayOfStrings();
    myArray.setString(0, "Java");
    myArray.setString(1, "Testing");
    myArray.setString(2, "JUnit");

}
    @Test
    public void throwsArrayIndexOutofBounds(){
        Assertions.assertThrows(IndexOutOfBoundsException.class,()-> myArray.getString(4));
    }

}