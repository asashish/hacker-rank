package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyClass {

	public static void main(String[] args) {
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
		List<String> asList = versionList;
		MyComparator myComparator = new MyComparator();
		asList.stream().sorted(myComparator).forEach(m-> System.out.println(m));
	}

}
