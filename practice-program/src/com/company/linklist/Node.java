package com.company.linklist;

import java.util.Objects;

public class Node<T> {

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
        com.company.linklist.Node<?> node = (Node<?>) o;
        return element.equals(node.element) && next.equals(node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element, next);
    }

}
