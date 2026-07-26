package Lab1;

import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter side: ");
		double side = sc.nextDouble();

		double volume = Math.pow(side, 3);

		System.out.printf("The volume of a cube = %.3f", volume);
	}
}
