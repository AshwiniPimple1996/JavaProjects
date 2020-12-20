package com.basics;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList<>();
		
		ar.add("HI..");
		ar.add(1);
		ar.add("Ashwini");
		ar.add("Pimple");
		ar.add(100);
		
		System.out.println(ar.size());
		//System.out.println(ar.get(0));
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
	}
}
