package com.company;

//this code for convert float number into reverse

public class FloatReverse {

    public static void main(String[] args) {
        float aFloat = 553.3456f;
        String text = Float.toString(Math.abs(aFloat));
        char[] textArray = new char[text.length()+1];
        textArray = text.toCharArray();
        String revString = "";
        for (char c : textArray) {
            revString = c+revString;
        }
        System.out.println("the given number reverse "+revString);
    }
}
