package ru.clevertec.ghoncharko;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();
    @Test
    public void isPositiveNumberTest(){
        Assertions.assertTrue(stringUtils.isPositiveNumber("123"));
    }
}
