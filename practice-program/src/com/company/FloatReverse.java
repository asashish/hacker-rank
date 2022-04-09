package com.company;

//how to reverse a decimal number without converting into strings

public class FloatReverse {

    public static void main(String[] args) {
        float aDecimal = 123.123f;
        System.out.println(aDecimal);
        int count=0;
        while (aDecimal % 1 != 0){
            aDecimal = aDecimal*10;
            count++;
        }
        FloatReverse.reverse(count, aDecimal);
    }

    public static float reverse(int count, float value){
        FloatReverse fr1 = new FloatReverse();
        int number = (int) value;
        float reverseNum = 0;
        int remainder  = 0;
        int totalLength = 0;
        while (number != 0){
            remainder = number%10;
            reverseNum = (reverseNum*10)+remainder;
            number = number/10;
            totalLength++;
        }
        System.out.println(reverseNum);
        FloatReverse.convertIntoDecimal((totalLength-count), reverseNum);
        return reverseNum;
    }

    public static float convertIntoDecimal(int count, float number){
        int divValue = 1;
        while(count != 0){
            divValue = divValue*10;
            count --;
        }
        float temp = number/divValue;
        System.out.println(temp);
        return temp;
    }
}
