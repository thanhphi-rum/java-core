package Lab2;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.print("Enter c: ");
		int c = sc.nextInt();

		System.out.printf("==> %dx^2 + %dx + %d = 0\n", a, b, c);

		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("==> Vo so nghiem");
			} else if (b == 0 && c != 0) {
				System.out.println("==> Vo nghiem");
			} else {
				double x = (double) -c / b;
				System.out.printf("==> x = %.3f", x);
			}
		}

		if (a != 0) {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("==> Vo nghiem");
			} else if (delta == 0) {
				double x = (double) -b / (2 * a);
				System.out.printf("==> x = %.3f (nghiem kep)", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("==> x1 = %.3f, x2 = %.3f", x1, x2);
			}
		}
	}
}
