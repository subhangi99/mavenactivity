package com.accenture.newmavenproject2;
import java.util.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(1, "java");
		map.put(2,"Sap");
		map.put(3, "Salesforce");
		NavigableMap<Integer,String>reverse=map.descendingMap();
		System.out.println(reverse);
    }
}
