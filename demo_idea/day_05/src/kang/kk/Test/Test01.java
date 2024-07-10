package kang.kk.Test;

import java.io.IOException;
import java.math.BigDecimal;

public class Test01 {
    public static void main(String[] args) throws IOException {
        //BigDecimal的底层存储原理：存储的是各个字符对应的ASCII码
        BigDecimal bd1 = new BigDecimal("0.226");    // [48,46, 50, 50, 54]
        BigDecimal bd2 = new BigDecimal("123.226");  // [49, 50, 51, 46, 50, 50, 54]
        BigDecimal bd3 = new BigDecimal("-1.5");     // [45, 49, 46, 53]


    }
}


