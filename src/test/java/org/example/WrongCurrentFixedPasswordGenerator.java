package org.example;

public class WrongCurrentFixedPasswordGenerator implements PasswordGenerator{

    @Override
    public String generatePassword() {
        return "ab"; //2글자
    }
}
