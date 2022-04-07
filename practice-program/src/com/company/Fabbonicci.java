package com.company;

import java.util.stream.IntStream;

//0,1,1,2,3,5,8

public class Fabbonicci {

	public static void main(String[] args) {
	IntStream.range(0, 10).forEach(m-> System.out.println(recursivMethod(m)));

	}

	public static int recursivMethod(int a) {
		if(a==0) {
			return 0;
		}
		if(a==1) {
			return 1;
		}else {
			return recursivMethod(a-2)+recursivMethod(a-1);
		}
			
	}
	
}
