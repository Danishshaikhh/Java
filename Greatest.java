package basicjava;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1, n2, n3;
		System.out.println("Enter three numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		if(n1>n2&&n1>n3)
			System.out.println("Largest is"+n1);
		else if (n2>n3)
			System.out.println("Largest is"+n2);
		else 
			System.out.println("Largest is"+n3);
	
		
	}

}
