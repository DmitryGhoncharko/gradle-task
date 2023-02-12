package ru.clevertec.ghoncharko.core;


import ru.clevertec.ghoncharko.StringUtils;

public class Utils {
    public static boolean isAllPositiveNumbers(String str1, String str2) {
        StringUtils stringUtils = new StringUtils();
        return stringUtils.isPositiveNumber(str1) && stringUtils.isPositiveNumber(str2);
    }
}
