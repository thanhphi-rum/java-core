package javacore;

import java.util.Scanner;

public class Bai2Lab1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length : ");
		Double length = sc.nextDouble();

		System.out.println("Enter width: ");
		Double width = sc.nextDouble();

		Double perimeter = (length + width) * 2;
		Double area = length * width;
		Double edgeMin = Math.min(length, width);

		System.out.printf("Perimeter = " + perimeter + "\n" + "Area = " + area + "\n" + "Edge min = " + edgeMin);
	}
}
