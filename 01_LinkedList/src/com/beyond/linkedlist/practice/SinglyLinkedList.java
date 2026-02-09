package com.beyond.linkedlist.practice;

public class SinglyLinkedList<E> implements List<E> {
    // 연결 리스트의 첫 번째 노드를 가리키는 참조
    private Node<E> head;

    // 노드의 개수를 저장
    private int size;

    // 기본값 세팅 기본 생성자로 명시
    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void addFirst(E element) {
        // 새 노듣 생성
        Node<E> newNode = new Node<>(element);

        if (head != null) {
            newNode.next = head;
        }
        head = newNode;

        this.size ++;
    }

    @Override
    public void addLast(E element) {
        Node<E> newNode = new Node<>(element);

        if (head == null) {
            head = newNode;
        } else {
            Node<E> lastNode = search(size-1);
            lastNode.next = newNode;
        }

        this.size ++;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            addFirst(element);
        } else {
            Node<E> newNode = new Node<>(element);
            Node<E> prevNode = search(index - 1);

            newNode.next = prevNode.next;
            prevNode.next = newNode;

            size ++;
        }
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        return search(index).data;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean contains(E element) {
        Node<E> currentNode = head;

        while (currentNode != null) {
            if (currentNode.data.equals(element)) {
                return true;
            }

            currentNode = currentNode.next;
        }

        return false;
    }

    @Override
    public void removeFirst() {
        if (head != null) {
            Node<E> firstNode = head;

            head = firstNode.next;
            firstNode.data = null;
            firstNode.next = null;

            size --;
        }

    }

    @Override
    public void removeLast() {
        if ((size - 2) < 0) {
            removeFirst();
        } else {
            // 마지막 노드 이전 노드
            Node<E> lastPrevNode = search(size - 2);

            // 마지막 노드의 data와 next(next는 원래 null임) null 처리
            lastPrevNode.next.data = null;
            lastPrevNode.next.next = null;

            // 마지막 노드 이전 노드의 next null 처리
            lastPrevNode.next = null;

            size --;
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            removeFirst();
        } else if (index == (size -1)) {
            removeLast();
        } else {
            Node<E> prevNode = search(index - 1);

            // 삭제할 대상 노드
            // Node<E> targetNode = search(index);
            Node<E> targetNode = prevNode.next;

            prevNode.next = targetNode.next;
            targetNode.data = null;
            targetNode.next = null;

            size --;
        }
    }

    @Override
    public void remove(E element) {
        Node<E> currentNode = head;

        // null -> 아무런 작동 안함
        if (currentNode != null) {
            if (currentNode.data.equals(element)) {
                removeFirst();
            } else {
                for (int i = 0; i < size - 1; i++) {
                    if (currentNode.next.data.equals(element)) {
                        Node<E> targetNode = currentNode.next;

                        currentNode.next = targetNode.next;
                        targetNode.data = null;
                        targetNode.next = null;

                        size --;

                        // 먼저 찾은 노드만 제거
                        break;
                    }
                }

                currentNode = currentNode.next;
            }
        }
    }

    @Override
    public String toString() {
        Node<E> currentNode = head;

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (currentNode != null) {
            sb.append(currentNode.data).append(", ");

            currentNode = currentNode.next;
        }

        // 문자열에 쉼표가 하나라도 존재하는 경우에만 마지막 쉼표 제거
        if (sb.lastIndexOf(",") != -1) {
            // replace(start, end, str) 메서드
            // start 인덱스부터 end 인덱스 - 1 까지의 문자열을 str로 바꾼다.
            sb.replace(sb.lastIndexOf(","), sb.length(), "");
        }

        sb.append("]");

        return sb.toString();
    }

    // 지정된 인덱스에 위치한 노드를 반환한다.
    private Node<E> search(int index) {
        Node<E> currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    // 내부 클래스
    private static class Node<E> {
        // 노드가 저장하는 데이터
        private E data;
        // 다음 노드를 가리키는 참조
        private Node<E> next;

        // 노드 객체를 생성할 때 사용할 생성자
        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}
