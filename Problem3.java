package com.tandemloop;
import java.util.Scanner;
import java.util.ArrayList;
public class Problem3 {
	public static ArrayList<Integer> oddNumbers(int a){
		if(a%2==0) {
			a=a-1;
		}
		ArrayList<Integer>arr=new ArrayList<>();
	int count=0;
	int i=1;
	while(count!=a) {
	   if(i%2!=0) {
		   arr.add(i);
		   count++;
	   }
	  i++;
	}
	return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Number:");
			int a=sc.nextInt();
			if(a<=0) {
				System.out.println("Invalid Input Enter numbers from 1");
			}
			else {
		ArrayList<Integer>arr1=oddNumbers(a);
		for(int i=0;i<arr1.size()-1;i++){
			System.out.print(arr1.get(i) +",");
		}
		System.out.print(arr1.get(arr1.size()-1));
			}

	}

}
