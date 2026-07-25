package javacore;

import java.util.Scanner;

public class Bai3Lab1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter side: ");
		Double side = sc.nextDouble();

		Double volume = Math.pow(side, 3);

		System.out.printf("The volume of a cube = %.3f", volume);
	}
}
