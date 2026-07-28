package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int size;
		System.out.print("Nhập kích thước của mảng A: ");
		size = sc.nextInt();

		int[] a = new int[size];
		System.out.println("=== Nhập phẩn tử của mảng A ===");

		for (int i = 0; i < size; i++) {
			System.out.printf("Nhập giá trị cho phần tử [%d]: ", i + 1);
			a[i] = sc.nextInt();
		}

		System.out.print("Mảng A vừa nhập: ");
		for (int i : a) {
			System.out.printf("%d ", i);
		}

		System.out.printf("\nMảng đã sắp xếp (tăng dần): ");
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));

		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}

		System.out.println("Giá trị lớn nhất là: " + max);
		System.out.println("Giá trị nhỏ nhất là: " + min);
	}
}
