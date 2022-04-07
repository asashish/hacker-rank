package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class JavaComparatorSort {

    public static void main (String args[]){
        List<String> list = new ArrayList<>();
        list.add("Ashish");
        list.add("Subhash Panday");
        list.add("Prity Sinha");
        list.add("Shobha");
        list.add("Vivek");
        list.add("Anu");

        System.out.println(list.toString());
        List<String> list1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list1.toString());
        List<String> list2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list2.toString());
        Comparator<String> c= (s1,s2)->{
            int l1 = s1.length();
            int l2 = s2.length();
            if(l1<l2) return +1;
            else if(l1>l2) return -1;
            else return s1.compareTo(s2);
        };
        List<String> list3 = list.stream().sorted(c).collect(Collectors.toList());
        System.out.println(list3.toString());



    }

}
