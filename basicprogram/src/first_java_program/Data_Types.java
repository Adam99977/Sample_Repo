package first_java_program;

import java.util.Scanner;

public class Data_Types {

	public static void main(String[] args) {
		
		
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter the value of X");
		float X = SC.nextFloat();
		System.out.println("Enter the value of A");
		int A = SC.nextInt();
		System.out.println("Enter the value of B");
		int B = SC.nextInt();
		float C = X*A*B;
		System.out.println("The Out put is "+C);
		SC.close();
		
		//int a = 10;
		//float b = 3.14f;
		//double c = 3.1444f;
		//char d = 'A';
		//short e = 12345;
		//long f = 1234567;
		//
		//System.out.println("It is the interger = "+a);
		//System.out.println("It is the Float = "+b);
		//System.out.println("It is the Double = "+c);
		//System.out.println("It is the Char = "+d);
		//System.out.println("It is the Short = "+e);
		//System.out.println("It is the Long = "+f);
		
	}

}
