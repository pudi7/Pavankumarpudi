package com.tandemloop;
import java.util.Scanner;
import java.util.ArrayList;
public class Problem2 {
	public static ArrayList<Integer> oddNumbers(int a){
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
		// TODO Auto-generated method stub
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
