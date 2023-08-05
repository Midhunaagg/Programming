package programmingpractice;
//WAJP to read n elements from the user and store it inside the container and print all the elements

import java.util.Scanner;

public class A2 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the element");
    int n=sc.nextInt();
    int[] a=new int[n];//create object to store the size
    System.out.println(n);
    for (int i = 0; i < a.length; i++) {
    	a[i]=sc.nextInt();//it will update the value that user pass
    	
    	
		
	}
    for (int i = 0; i < a.length; i++) {    //This loop is to print the elements that i have stored
    	System.out.println(a[i]);
		
	}
	}

}
