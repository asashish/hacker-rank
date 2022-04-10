package com.company.linklist;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        LinkList<Integer> newInt = new LinkList<>();
        newInt.add(1);
        newInt.add(2);
        newInt.add(3);
        newInt.add(4);
        System.out.println("Print all linkedlist element: ");
        System.out.println(newInt.printAll());
        System.out.println("Reverse and print all linkedlist element: ");
        newInt.reverse();
        System.out.println(newInt.printReverse());

        /*
         * From here size value would not be correct as linkedlist become circular
         * */
        printFirstCycle(newInt.cyclicLinkedList());
        Node<Integer> newNode = new Node<>(5, null);
        Node<Integer> newIntegerLinkedList = circularLinkedListInsertion(newInt.cyclicLinkedList(), newNode);
        Node<Integer> newNode2 = new Node<>(6, null);
        Node<Integer> newIntegerLinkedList2 = circularLinkedListInsertion(newIntegerLinkedList, newNode2);
        Node<Integer> newNode3 = new Node<>(7, null);
        circularLinkedListInsertion(newIntegerLinkedList2, newNode3);
    }

    /*
    * Circular Linked List Traversal
    * */
    private static void printFirstCycle(Node<Integer> cyclicList) {
        List<Node> arrayList = new ArrayList<>();
        Node<Integer> integerNode = cyclicList;
        while(!arrayList.contains(integerNode)){
            arrayList.add(integerNode);
            integerNode = integerNode.next;
        }
        System.out.println("Circular Linked List Traversal: ");
        arrayList.forEach(n-> System.out.println(n.element));
    }

    /*
     * Circular Singly Linked List Insertion
     * */
    private static Node<Integer> circularLinkedListInsertion(Node<Integer> cyclicList,Node<Integer> newNode) {
        List<Node> arrayList = new ArrayList<>();
        Node<Integer> integerNode = cyclicList;
        while(!arrayList.contains(integerNode.next)){
            arrayList.add(integerNode);
            integerNode = integerNode.next;
        }
        arrayList.add(integerNode);
        Node<Integer> current = integerNode.next;
        integerNode.next = newNode;
        newNode.next = current;
        arrayList.add(newNode);
        System.out.println("Circular Singly Linked List Insertion: ");
        arrayList.forEach(n-> System.out.println(n.element));
        return newNode;
    }
}
