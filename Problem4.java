package com.tandemloop;
import java.util.*;
public class Problem4 {
 static HashMap<Integer,Integer>Multiples(ArrayList<Integer>arr){
	HashMap<Integer,Integer>map=new HashMap<>();
	 for(int i=1;i<10;i++) {
		 int count=0;
		 for(int num:arr) {
			 if(num%i==0) {
				 count++;
			 }
		 }
		 map.put(i,count);
	 }
	 return map;
	 }
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<Integer> arr1=new ArrayList<>();
	StringBuilder number=new StringBuilder();
	System.out.println("Enter the values..");
	String str=sc.nextLine();
	for(char ch:str.toCharArray()) {
		if(Character.isDigit(ch)) {
			number.append(ch);
			}
		else if(number.length()>0) {
			arr1.add(Integer.parseInt(number.toString()));
			number.setLength(0);
		}
	}
    HashMap<Integer,Integer>map1=Multiples(arr1);
    System.out.println(map1);
	
}
}
