package programmingpractice;

import java.util.Scanner;

//WAJP to create a character array of size 5 read the character from the user and store it iside the character array.
public class A5 {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char [] ch=new char[5];
    System.out.println("enter five character");
    for (int i = 0; i < ch.length; i++) {
		ch[i]=sc.next().charAt(3);
		
	}
    for (int i = 0; i < ch.length; i++) {
    	System.out.println(ch[i]);
		
	}
	}
	

}
