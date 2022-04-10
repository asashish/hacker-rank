package com.company.linklist;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LinkList<T> {
    private Node<T> last;
    private Node<T> first;
    private List<T> reverse = new ArrayList<>();

    int size;

    public void add(T value){
        Node<T> newNode = new Node<>(value, last);
        last = newNode;
        size++;
    }

    public static class Node<T> {
        T element;
        Node<T> next;

        public Node(T element, Node<T> node) {
            this.element = element;
            this.next = node;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Node)) return false;
            Node<?> node = (Node<?>) o;
            return element.equals(node.element) && next.equals(node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(element, next);
        }
    }

    public List<T> print(Node<T> startNode){
        Node<T> node = startNode;
        List<T> list = new ArrayList();
        while(node.next!=null){
            list.add(node.element);
            node = node.next;
        }
        list.add(node.element);
        return list;
    }

    public List<T> printAll(){
       return print(last);
    }

    public void reverse(){
        Node<T> prev = null;
        Node<T> next = null;
        Node<T> current = last;
        while(current !=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        first = prev;
    }

    public List<T> printReverse(){
        return print(first);
    }

    public Node<T> cyclicLinkedList(){
        last.next = first;
        return last.next;
    }

}
