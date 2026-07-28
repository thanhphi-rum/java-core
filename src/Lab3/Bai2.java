package Lab3;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập bảng cửu chương mong muốn (1->10): ");
		int x = sc.nextInt();
		System.out.printf("ĐÂY LÀ BẢNG CỬU CHƯƠNG %d: \n", x);

		for (int i = 1; i <= 10; i++) {
			System.out.printf(" %d x %d = %d\n", x, i, x * i);
		}
	}
}
