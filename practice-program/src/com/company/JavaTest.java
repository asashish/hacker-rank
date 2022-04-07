package com.company;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class JavaTest {
    public static void main(String args[]){

        List<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(4);
        list.add(2);
        list.add(1);
        System.out.println(list);
        List<Integer> l2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(l2);
        List<Integer> l3 = list.stream().filter(i->i%2==0).map(i->i+5).sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
        System.out.println(l3);
        long l4 = list.stream().filter(i->i%2==0).map(i->i+5).count();
        System.out.println(l4);
        List<Integer> l5 = list.stream().filter(i->i%2==0).map(i->i+5).sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Default asc Sorting "+l5);
        List<Integer> l6 = list.stream().filter(i->i%2==0).map(i->i+5).sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Default desc Sorting "+l6);
        System.out.println(list.stream().min((i1,i2)->i1.compareTo(i2)).get());
        System.out.println(list.stream().max((i1,i2)->i1.compareTo(i2)).get());
        list.stream().forEach(System.out::println);
        Consumer<Integer> consumer = i->{
            System.out.println("Square of "+i+" is "+i*i);
        };

        list.stream().forEach(System.out::println);
        list.stream().forEach(consumer);

    }
    // (i1,i2)->(i1<i2)?1:(i1>i2)?-1:0
}
