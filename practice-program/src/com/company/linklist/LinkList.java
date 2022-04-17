package com.company.linklist;

import java.util.ArrayList;
import java.util.List;

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
