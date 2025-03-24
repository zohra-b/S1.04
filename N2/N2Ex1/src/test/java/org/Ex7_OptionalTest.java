package org;

import org.junit.jupiter.api.Test;

import java.util.Optional;

public class Ex7_OptionalTest {
    Optional<String> optionalString = Optional.empty();


    @Test
    void optionalIsEmpty(){
        assert(optionalString.isEmpty());

    }
}
