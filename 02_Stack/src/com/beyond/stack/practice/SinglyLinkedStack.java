package com.beyond.stack.practice;

public class SinglyLinkedStack<E> implements Stack<E> {
    private int size;

    private Node<E> top;

    public SinglyLinkedStack() {
        this.size = 0;
        this.top = null;
    }

    @Override
    public void push(E element) {
        Node<E> newNode = new Node<>(element);

        newNode.next = top;
        top = newNode;

        size ++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public E pop() {
        return null;
    }

    @Override
    public boolean contains(E element) {
        return false;
    }

    @Override
    public E peek() {
        return null;
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    @Override
    public String toString() {
        Node<E> currentNode = top;

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        while (currentNode != null) {
            sb.insert(1, currentNode.data + ", ");

            currentNode = currentNode.next;
        }

        if (sb.lastIndexOf(",") != -1) {
            sb.replace(sb.lastIndexOf(","), sb.length(), "");
        }

        sb.append("]");

        return sb.toString();
    }
}
