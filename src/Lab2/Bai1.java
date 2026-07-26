package Lab2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a: ");
		int a = sc.nextInt();

		System.out.println("Enter b: ");
		int b = sc.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			double x = -b / a;
			System.out.println("Phuong trinh co nghiem x = " + x);
		}
	}
}
