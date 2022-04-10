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
        System.out.println(newInt.printAll());
        newInt.reverse();
        System.out.println(newInt.printReverse());
        printFirstCycle(newInt.cyclicLinkedList());

    }


    private static void printFirstCycle(LinkList.Node<Integer> cyclicList) {
        List<LinkList.Node> arrayList = new ArrayList<>();
        LinkList.Node<Integer> integerNode = cyclicList;
        while(!arrayList.contains(integerNode)){
            arrayList.add(integerNode);
            integerNode = integerNode.next;
        }
        arrayList.forEach(n-> System.out.println(n.element));
    }
}
