package SeleniumDemo2;

import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {

		int a, b;

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first number : ");
		a = s.nextInt();
		System.out.println("Enter sencond number : ");
		b = s.nextInt();
		System.out.println("Numbers before swapping " + a + " and " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("Numbers after swapping " + a + " and " + b);
	}

}
