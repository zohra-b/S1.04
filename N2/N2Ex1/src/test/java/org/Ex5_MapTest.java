package org;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Ex5_MapTest {
    Map<String, String> myAuthors = new HashMap<>();

    @BeforeEach
    void setUp() {
        myAuthors.put("Anais", "Nin");
        myAuthors.put("Nancy", "Huston");
        myAuthors.put("Annie", "Ernaux");
    }

    @Test
    void isAddedKey(){
        assert(myAuthors.containsKey("Nancy"));
    }
}
