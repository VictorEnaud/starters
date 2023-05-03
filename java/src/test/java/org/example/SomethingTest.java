package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SomethingTest {
    @Test
    void whenSomething_thenTrue() {
        // Given
        var something = new Something();

        // When
        var somethingResult = something.execute();

        // Then
        assertThat(somethingResult).isTrue();
    }
}