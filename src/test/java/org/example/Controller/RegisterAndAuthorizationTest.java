package org.example.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegisterAndAuthorizationTest {

    @Test
    void registerAndAuthorization() {
        RegisterAndAuthorization authorization = new RegisterAndAuthorization();
        Assertions.assertNotNull(authorization);
    }
}