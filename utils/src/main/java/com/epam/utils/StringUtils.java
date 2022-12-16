package com.epam.utils;

import org.apache.commons.lang3.*;
import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isParsable(str) && !str.startsWith("0") && Double.parseDouble(str) > 0;
    }
}
