package com.company;

import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */
/*
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    // Write your code here
    
    int apple = 0;
    int orange = 0;
    
    for(int i=0; i<apples.size(); i++)
    {
        int loc = apples.get(i)+a;
        if(loc>=s && loc<=t){
            apple=apple+1;
        }

     }
    
    
    for(int i=0; i<oranges.size(); i++)
    {
        int loc = oranges.get(i)+b;
        if(loc>=s && loc<=t){
            orange=orange+1;
            }
       
    	}
 	System.out.println(apple);
    System.out.println(orange);
    }
    
    public static void main(String args[]) {
    	Result rest = new Result();
    	List<Integer> apples = new ArrayList<Integer>();
    	apples.add(2);
    	apples.add(3);
    	apples.add(-4);
    	List<Integer> oranges = new ArrayList<Integer>();
    	oranges.add(3);
    	oranges.add(-2);
    	oranges.add(-4);
    	rest.countApplesAndOranges(7, 10, 4, 12, apples, oranges);
    }
    */
	
	
//	public static String kangaroo(int x1, int v1, int x2, int v2) {
//	    // Write your code here
//		if(v1>v2) {
//			int remender = (x1-x2)%(v2-v1);
//			if(remender==0) {
//				return "YES";
//			}
//		}
//	    return "NO";
//	    }
//	
//	public static void main(String args[]) {
//		Result rest = new Result();
//    	System.out.println(rest.kangaroo(0, 3, 4, 2));
//    	System.out.println(rest.kangaroo(2, 1, 1, 2));
//    	System.out.println(rest.kangaroo(0, 2, 5, 3));
//    }
	
	
	public static void main(String args[]) {
		Result rest = new Result();
//		versionList{ "1.2.0", "3.4.1" , "1.3.12" }

		List<String> versionList = new ArrayList<>();
		versionList.add("1.2.0");
		versionList.add("3.4.1");
		versionList.add("8.9.16");
		versionList.add("1.3.12");
		versionList.add("4.3.12");
		versionList.add("4.8.12");
		versionList.add("4.9.12");
		versionList.add("4.9.15");
		versionList.add("8.9.111");
		versionList.add("0.9.111");
		rest.findLatestRelease(versionList);
	}
	
	public String findLatestRelease(List<String> versionList) {
		String firstValue = "";
		String secondValue = "";
		int[] firstValueArray;
		int[] secondValueArray;
		String finalVersion = null;
		Result rest = new Result();
		firstValue = versionList.get(0);
		for (int i = 0, j = 1; i < versionList.size() && j < versionList.size(); i++, j++) {
			
			secondValue = versionList.get(j);
			firstValueArray = rest.dotSeprateArray(firstValue);
			secondValueArray = rest.dotSeprateArray(secondValue);
			System.out.println("firstValue "+firstValue);
			System.out.println("secondValue "+secondValue);

			for (int k = 0, l = 0; k < firstValueArray.length && l < secondValueArray.length; k++, l++) {
				if (firstValueArray[k] < secondValueArray[l]) {
					finalVersion = secondValue;
				} else if(firstValueArray[k] == secondValueArray[l] && firstValueArray[k+1] < secondValueArray[l+1]) {
					finalVersion = secondValue;
					
				} else if(firstValueArray[k] == secondValueArray[l] && firstValueArray[k+1] == secondValueArray[l+1] && firstValueArray[k+1] == secondValueArray[l+1]) {
					finalVersion = secondValue;
					
				}else
				{
					finalVersion = firstValue;
				}
				System.out.println("finalVersion "+finalVersion);
				System.out.println(k);
				firstValue=finalVersion;
				break;
				
			}

		}

		System.out.println(finalVersion);
		return finalVersion;
	}

	public int[] dotSeprateArray(String inputString) {
		int[] returnArray = new int[3];
		String[] tempArray = inputString.split("\\.");
		int count = 0;
		int tempVar = 0;
		for (String s : tempArray) {
			tempVar = Integer.parseInt(s);
			returnArray[count] = tempVar;
			count++;
		}
		return returnArray;
	}
}