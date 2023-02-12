package ru.clevertec.ghoncharko;

import static org.apache.commons.lang3.StringUtils.isNumeric;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.apache.commons.lang3.StringUtils.isNotEmpty;

public class StringUtils {
    public boolean isPositiveNumber(String str) {
        if (isNotBlank(str) && isNotEmpty(str) && isNumeric(str)) {
            return Long.parseLong(str) > 0;
        }
        return false;
    }
}
