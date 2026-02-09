package com.beyond.stack;

import com.beyond.stack.practice.ArrayStack;
import com.beyond.stack.practice.Stack;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 자바에서 제공하는 Stack 클래스 테스트
        // Stack<String> stack = new Stack<>();

        // System.out.println(stack);
        // System.out.println(stack.size());
        // System.out.println(stack.isEmpty());
        // System.out.println();
        // []
        // 0
        // true


        // push(), pop() 메서드 테스트
        // stack.push("딸기");
        // stack.push("포도");
        // System.out.println(stack);
        // System.out.println(stack.size());
        // System.out.println(stack.isEmpty());
        // System.out.println();
        // [딸기, 포도]
        // 2
        // false

        // System.out.println(stack);
        // [딸기, 포도]
        // System.out.println(stack.pop());
        // 포도
        // System.out.println(stack);
        // [딸기]
        // System.out.println();


        // contains() 메서드 테스트
        // System.out.println(stack.contains("포도"));
        // System.out.println(stack.contains("딸기"));
        // System.out.println();
        // false
        // true


        // peek() 메서드 테스트
        // 스택의 top의 요소를 반환하며 요소를 제거하지는 않는다. (pop() 메서드와 차이가 있다.)
        // System.out.println(stack.peek());
        // System.out.println(stack);
        // System.out.println();


        // ---------------------------------------------------------------------
        // ArrayStack 구현 및 테스트
        Stack<String> stack = new ArrayStack<>(5);

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println();
        // com.beyond.stack.practice.ArrayStack@4e50df2e (오버라이딩 전)
        // []   (오버라이딩 후)
        // 0
        // false


        // push(), pop() 메서드 구현
        stack.push("딸기");
        stack.push("포도");
        // stack.push("키위");
        // stack.push("복숭아");

        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println();
        // [딸기, 포도]
        // 2
        // false

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());
        System.out.println();
        // 포도
        // [딸기]
        // 1
        // false


        // contains() 메서드 구현
        System.out.println(stack);
        System.out.println(stack.contains("포도"));
        System.out.println(stack.contains("딸기"));
        System.out.println();
        // [딸기]
        // false
        // true


        // peek() 메서드 구현
        // 스택의 top의 요소를 반환하며 요소를 제거하지는 않는다. (pop() 메서드와 차이가 있다.)
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println();
        // 딸기
        // [딸기]
    }
}
