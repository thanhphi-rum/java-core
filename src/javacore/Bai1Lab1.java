package javacore;

import java.util.Scanner;

public class Bai1Lab1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name student: ");
		String nameStudent = sc.nextLine();

		System.out.println("Enter mark average: ");
		Double markAverage = sc.nextDouble();

		System.out.println(nameStudent + " co diem = " + markAverage);
	}
}
