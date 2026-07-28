package Lab2;

import java.util.Scanner;

public class Bai4 {

	public static void phuongTrinhBacNhat(int a, int b) {
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

	public static void phuongTrinhBacHai(int a, int b, int c) {
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

	public static void tinhTienDien(double soDien) {
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
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ --------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai	|");
		System.out.println("| 3. Tính số tiền điện		|");
		System.out.println("| 4. Kết thúc			|");
		System.out.println("++ --------------------------- ++");

		System.out.print("Nhap lua chon cua ban tai day (1->4): ");
		int luaChon = sc.nextInt();

		if (luaChon < 1 || luaChon > 4) {
			System.out.println("Lựa chọn không hợp lệ!");
			sc.close();
			return;
		}

		switch (luaChon) {

		case 1: {
			System.out.print("Enter a: ");
			int a = sc.nextInt();
			System.out.print("Enter b: ");
			int b = sc.nextInt();

			phuongTrinhBacNhat(a, b);
			break;
		}

		case 2: {
			System.out.print("Enter a: ");
			int a = sc.nextInt();
			System.out.print("Enter b: ");
			int b = sc.nextInt();
			System.out.print("Enter c: ");
			int c = sc.nextInt();

			phuongTrinhBacHai(a, b, c);
			break;
		}

		case 3: {
			System.out.println("Nhap vao so dien: ");
			double soDien = sc.nextDouble();

			tinhTienDien(soDien);
			break;
		}

		case 4:
			System.out.println("Chương trình kết thúc");
			break;
		}

		sc.close();
	}
}
