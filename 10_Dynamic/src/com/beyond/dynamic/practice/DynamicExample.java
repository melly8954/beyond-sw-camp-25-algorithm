package com.beyond.dynamic.practice;

import java.util.HashMap;
import java.util.Map;

/*
    피보나치 수열
     - [0] [1] [2] [3] [4] [5] [6]  [7] [8] [9] [10]
     -  0,  1,  1,  2,  3,  5,  8,  13, 21,  34, 55 ....
*/
public class DynamicExample {
    // 계산된 피보나치 수열의 항을 저장하는 자료구조이다.
    //  - Key는 피보나치 수열의 항
    //  - Value는 해당 항의 피보나치 수
    private static final Map<Long, Long> memo = new HashMap<>();

    public static long fibonacci(long n) {
        if (n<= 1) {
            return n;
        } else if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            long result = fibonacci(n - 1) + fibonacci(n - 2);
            memo.put(n, result);

            return result;
        }
    }
}
