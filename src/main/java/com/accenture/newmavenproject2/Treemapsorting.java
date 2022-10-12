package com.accenture.newmavenproject2;

import java.util.*;

public class Treemapsorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(1, "java");
		map.put(2,"Sap");
		map.put(3, "Salesforce");
		NavigableMap<Integer,String>reverse=map.descendingMap();
		System.out.println(reverse);

	}

}
