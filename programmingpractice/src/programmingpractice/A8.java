package programmingpractice;
//WAJP to read n Product prices from the users and store it inside a container, then average price
import java.util.Scanner;

public class A8 {

	public static void main(String[] args) {
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the product");
		int n=sc.nextInt();
		double [] d= new double[n];
		System.out.println("Enter the price of the prduct");
		for (int i = 0; i < d.length; i++) {
			d[i]=sc.nextDouble();
			
			 sum=sum+d[i];
			
	}
		double avg=sum/n;
		System.out.println(avg);

}
}