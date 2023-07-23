package org.example.dao;

import org.example.domain.User;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoTest {

    @ParameterizedTest
    @MethodSource("userCreateSample")
    public void add(User user) {
        Throwable exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    throw new IllegalArgumentException("Exception message");
                }
        );

        assertEquals("Exception message", exception.getMessage());
    }

    public static Stream<Arguments> userCreateSample() {
        return Stream.of(
                Arguments.arguments(new User("heehae1117", "박희해", "password1")),
                Arguments.arguments(new User("heehae0104", "박희해", "password1"))
        );
    }

}
