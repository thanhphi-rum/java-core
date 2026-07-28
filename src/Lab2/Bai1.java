package Lab2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = sc.nextInt();

		System.out.print("Enter b: ");
		int b = sc.nextInt();

		System.out.printf("==> %dx + %d = 0\n", a, b);

		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh vo nghiem");
		} else {
			double x = (double) -b / a;
			System.out.printf("==> x = %.3f", x);
		}
	}
}
