package Lab1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length : ");
		double length = sc.nextDouble();

		System.out.println("Enter width: ");
		double width = sc.nextDouble();

		double perimeter = (length + width) * 2;
		double area = length * width;
		double edgeMin = Math.min(length, width);

		System.out.printf("Perimeter = " + perimeter + "\n" + "Area = " + area + "\n" + "Edge min = " + edgeMin);
	}
}
