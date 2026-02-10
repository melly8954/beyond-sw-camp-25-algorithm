package com.beyond.queue;

import com.beyond.queue.practice.ArrayQueue;
import com.beyond.queue.practice.Queue;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application 실행 중..");
        System.out.println();

        // 자바에서 제공하는 Queue 테스트
        // Queue<String> queue = new LinkedList<>();
        // Queue<String> queue = new ConcurrentLinkedQueue<>();
        // Enqueue
        // add() 메서드 테스트
        // queue.add("딸기");
        // queue.add("사과");
        // queue.add("키위");
        // System.out.println(queue);
        // System.out.println(queue.size());
        // System.out.println(queue.isEmpty());
        // System.out.println();
        // [딸기, 사과, 키위]
        // 3
        // false


        // Dequeue
        // poll() 메서드
        // System.out.println(queue.poll());
        // System.out.println(queue);
        // System.out.println(queue.size());
        // System.out.println(queue.isEmpty());
        // System.out.println();
        // 딸기
        // [사과, 키위]
        // 2
        // false


        // contains() 메서드 테스트
        // System.out.println(queue.contains("딸기"));
        // System.out.println(queue.contains("사과"));
        // System.out.println();
        // false
        // true


        // peek() 메서드 테스트
        // Queue에서는 FIFO에 따라 "사과" 출력
        // queue.add("바나나");
        // System.out.println(queue);
        // System.out.println(queue.peek());
        // System.out.println();
        // [사과, 키위, 바나나]
        // 사과


        // ------------------------------------------------------
        // ArrayQueue 구현 및 테스트
        Queue<String> queue = new ArrayQueue<>(5);

        // enqueue(), dequeue() 메서드 구현
        queue.enqueue("딸기");
        queue.enqueue("포도");
        queue.enqueue("사과");
        queue.enqueue("복숭아");
        queue.enqueue("오렌지");
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println();
        // [딸기, 포도, 사과, 복숭아, 오렌지]
        // 5
        // false

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println();
        // 딸기
        // 포도
        // [사과, 복숭아, 오렌지]
        // 3
        // false

        // 다시 과일 집어넣기 (Enqueue)
        queue.enqueue("바나나");
        queue.enqueue("두리안");
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println();
        // [사과, 복숭아, 오렌지, 바나나, 두리안]
        // 5
        // false

        // 과일 다 빼기
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println();
        // 사과
        // 복숭아
        // 오렌지
        // 바나나
        // 두리안
        // []
        // 0
        // true

        // contains(), peek() 메서드 테스트
        queue.enqueue("딸기");
        queue.enqueue("포도");
        queue.enqueue("사과");
        // [딸기, 포도, 사과]
        System.out.println(queue.contains("딸기"));
        System.out.println(queue.contains("포도"));
        System.out.println(queue.contains("바나나"));
        System.out.println();

        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        System.out.println();
    }
}
