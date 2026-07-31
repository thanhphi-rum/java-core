package Lab3;

import java.util.Scanner;

public class Bai1 {

	public static boolean isPrimes(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

//		int count = 0;
//
//		for (int i = 2; i < n - 1; i++) {
//			if (n % i == 0) {
//				count++;
//				break;
//			}
//		}
//		if (count != 0) {
//			return true;
//		} else {
//			return false;
//		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter integer: ");
		int n = sc.nextInt();

		if (!isPrimes(n)) {
			System.out.printf("%d không là số nguyên tố\n", n);
		} else {
			System.out.printf("%d là số nguyên tố\n", n);
		}

	}
}
