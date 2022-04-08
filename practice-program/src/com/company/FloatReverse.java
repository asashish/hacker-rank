package com.company;

public class FloatReverse {

    public static void main(String[] args) {
        FloatReverse fr = new FloatReverse();
        float aDecimal = 1234.123f;
        System.out.println(aDecimal);
        int count=0;
        while (aDecimal % 1 != 0){
            aDecimal = aDecimal*10;
            count++;
        }
        fr.reverse(count, aDecimal);
    }

    public float reverse(int count, float value){
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
        fr1.convertIntoDecimal((totalLength-count), reverseNum);
        return reverseNum;
    }

    public float convertIntoDecimal(int count, float number){
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
