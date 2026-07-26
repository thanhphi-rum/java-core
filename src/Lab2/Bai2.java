package Lab2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a: ");
		int a = sc.nextInt();

		System.out.println("Enter b: ");
		int b = sc.nextInt();

		System.out.println("Enter c: ");
		int c = sc.nextInt();

		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phuong trinh vo so nghiem");
			} else if (b == 0 && c != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				double x = -c / b;
				System.out.println("Phuong trinh co nghiem x = " + x);
			}
		}

		if (a != 0) {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				double x = -b / (2 * a);
				System.out.println("Phuong trinh co nghiem kep x = " + x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + x1 + " va x2 = " + x2);
			}
		}
	}
}
