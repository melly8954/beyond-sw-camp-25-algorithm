package com.beyond.linkedlist;

import com.beyond.linkedlist.practice.List;
import com.beyond.linkedlist.practice.SinglyLinkedList;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 자바에서 제공하는 LinkedList 테스트
        // List<String> list = new LinkedList<>();

        // addFirst(), addLast(), add() 메서드 테스트
        // list.addFirst("사과");
        // list.addFirst("딸기");
        // System.out.println(list);
        // [딸기, 사과]

        // list.addLast("포도");
        // list.addLast("키위");
        // System.out.println(list);
        // [딸기, 사과, 포도, 키위]

        // list.add(1, "수박");
        // System.out.println(list);
        // System.out.println();
        // [딸기, 수박, 사과, 포도, 키위]


        // get(), size(), contains() 메서드 테스트
        // System.out.println(list.get(0));    // 딸기
        // System.out.println(list.size());    // 5
        // System.out.println(list.contains("딸기"));    // true
        // System.out.println(list.contains("바나나"));   // false
        // System.out.println();


        // removeFirst(), removeLast(), remove() 메서드 테스트
        // list.removeFirst();
        // System.out.println(list);
        // [수박, 사과, 포도, 키위]

        // list.removeLast();
        // System.out.println(list);
        // [수박, 사과, 포도]

        // list.remove(0);
        // System.out.println(list);
        // [사과, 포도]

        // list.remove("포도");
        // System.out.println(list);
        // System.out.println();
        // [사과]

        // --------------------------------------------------------------------------------
        // SinglyLinkedList 구현 및 테스트
        List<String> list = new SinglyLinkedList<>();

        System.out.println(list);
        System.out.println();
        // com.beyond.linkedlist.practice.SinglyLinkedList@4e50df2e
        // com.beyond.linkedlist.practice.SinglyLinkedList의 toString() 오버라이딩 후 [] 출력


        // addFirst(), addLast(), add() 메서드 구현
        list.addFirst("사과");
        list.addFirst("딸기");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();
        // [딸기, 사과]
        // 2

        list.addLast("포도");
        list.addLast("키위");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();
        // [딸기, 사과, 포도, 키위]
        // 4

        list.add(0, "수박");
        System.out.println(list);
        System.out.println(list.size());
        // [수박, 딸기, 사과, 포도, 키위]
        // 5

        list.add(4, "복숭아");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();
        // [수박, 딸기, 사과, 포도, 복숭아, 키위]
        // 6

        // get(), contains() 메서드 구현
        System.out.println(list.get(0));    // 수박
        System.out.println(list.get(1));    // 딸기
        System.out.println(list.get(3));    // 포도
        System.out.println(list.get(5));    // 키위
        System.out.println();

        System.out.println(list.contains("딸기"));    // true
        System.out.println(list.contains("복숭아"));   // true
        System.out.println(list.contains("참외"));    // false
        System.out.println();

        // removeFirst(), removeLast(), remove() 메서드 구현
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.size());
        // [딸기, 사과, 포도, 복숭아, 키위]
        // 5
        list.removeFirst();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();
        // [사과, 포도, 복숭아, 키위]
        // 4
    }
}
