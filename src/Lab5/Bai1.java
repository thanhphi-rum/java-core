package Lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Double> list = new ArrayList<Double>();

		while (true) {
			System.out.print("Nhap phan tu cho danh sach: ");
			Double x = sc.nextDouble();
			list.add(x);
			sc.nextLine();
			System.out.print("Ban co muon nhap them khong (Y/N): ");
			if (sc.nextLine().equalsIgnoreCase("N")) {
				break;
			}
		}
		double sum = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		System.out.printf("Tong gia tri cua cac phan tu trong danh sach la: %.3f\n", sum);
	}
}
