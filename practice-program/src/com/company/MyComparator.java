package com.company;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		String[] arrayOfo1 = o1.split("\\.");
		String[] arrayOfo2 = o2.split("\\.");

		if (Integer.parseInt(arrayOfo1[0]) == Integer.parseInt(arrayOfo2[0])) {
			if (Integer.parseInt(arrayOfo1[1]) == Integer.parseInt(arrayOfo2[1])) {
				return Integer.parseInt(arrayOfo1[2]) - Integer.parseInt(arrayOfo2[2]);
			} else {
				return Integer.parseInt(arrayOfo1[1]) - Integer.parseInt(arrayOfo2[1]);
			}
		} else {
			return Integer.parseInt(arrayOfo1[0]) - Integer.parseInt(arrayOfo2[0]);
		}
	}

}
