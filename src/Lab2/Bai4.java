package Lab2;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ --------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai	|");
		System.out.println("| 3. Tính số tiền điện		|");
		System.out.println("| 4. Kết thúc			|");
		System.out.println("++ --------------------------- ++");

		System.out.println("Nhap lua chon cua ban tai day (1->4): ");
		int luaChon = sc.nextInt();

		if (luaChon < 1 || luaChon > 4) {
			System.out.println("Lựa chọn không hợp lệ!");
			sc.close();
			return;
		}

		switch (luaChon) {

		case 1: {
			System.out.print("Nhập a: ");
			int a = sc.nextInt();

			System.out.print("Nhập b: ");
			int b = sc.nextInt();

			if (a == 0 && b == 0) {
				System.out.println("Phương trình vô số nghiệm");
			} else if (a == 0) {
				System.out.println("Phương trình vô nghiệm");
			} else {
				double x = (double) -b / a;
				System.out.println("Phương trình có nghiệm x = " + x);
			}
			break;
		}

		case 2: {
			System.out.print("Nhập a: ");
			int a = sc.nextInt();

			System.out.print("Nhập b: ");
			int b = sc.nextInt();

			System.out.print("Nhập c: ");
			int c = sc.nextInt();

			if (a == 0) {
				if (b == 0 && c == 0) {
					System.out.println("Phương trình vô số nghiệm");
				} else if (b == 0) {
					System.out.println("Phương trình vô nghiệm");
				} else {
					double x = (double) -c / b;
					System.out.println("Phương trình có nghiệm x = " + x);
				}
			} else {
				double delta = b * b - 4 * a * c;

				if (delta < 0) {
					System.out.println("Phương trình vô nghiệm");
				} else if (delta == 0) {
					double x = (double) -b / (2 * a);
					System.out.println("Phương trình có nghiệm kép x = " + x);
				} else {
					double x1 = (-b + Math.sqrt(delta)) / (2 * a);
					double x2 = (-b - Math.sqrt(delta)) / (2 * a);

					System.out.println("Phương trình có 2 nghiệm phân biệt:");
					System.out.println("x1 = " + x1);
					System.out.println("x2 = " + x2);
				}
			}
			break;
		}

		case 3: {
			System.out.print("Nhập vào số điện: ");
			double soDien = sc.nextDouble();

			double soTien;

			if (soDien < 0) {
				System.out.println("Số điện không hợp lệ!");
			} else if (soDien <= 100) {
				soTien = soDien * 1000;
				System.out.printf("Số tiền điện là: %.0f VND%n", soTien);
			} else {
				soTien = 100 * 1000 + (soDien - 100) * 1500;
				System.out.printf("Số tiền điện là: %.0f VND%n", soTien);
			}
			break;
		}

		case 4:
			System.out.println("Chương trình kết thúc.");
			break;
		}

		sc.close();
	}
}
