package Lab2;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap vao so dien: ");
		double soDien = sc.nextDouble();

		double soTien;

		if (soDien < 0) {
			System.out.println("So dien khong hop le! (phai > 0)");
		} else if (soDien <= 100) {
			soTien = soDien * 1000;
			System.out.printf("So tien dien la: %.0f VND", soTien);
		} else {
			soTien = 100 * 1000 + (soDien - 100) * 1500;
			System.out.printf("So tien dien la: %.0f VND", soTien);
		}
	}
}
