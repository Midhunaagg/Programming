package programmingpractice;

import java.util.Scanner;

//WAJP to print a string array and read five number and store it in the array and print it.

public class A4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the five names");
		String [] s=new String[5];
	
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.next();
			
			
			
		}
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
			
		}
		

	}

}
