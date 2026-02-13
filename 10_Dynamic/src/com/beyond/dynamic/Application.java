package com.beyond.dynamic;

import com.beyond.dynamic.practice.DynamicExample;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // n이 커질수록 연산속도가 느려짐
        // map에 저장해서 사용 (메모제이션)
        long n = 50;

        long startTime;
        long endTime;
        startTime = System.currentTimeMillis();

        System.out.printf("피보나치 수열의 %d번째 항의 값은 %d입니다.\n", n, DynamicExample.fibonacci(n));

        endTime = System.currentTimeMillis();

        System.out.printf("%d초\n", (endTime - startTime) / 1000);
        System.out.println();
    }
}
