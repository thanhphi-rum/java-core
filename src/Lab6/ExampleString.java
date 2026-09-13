package Lab6;

import java.util.Scanner;

public class ExampleString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter is username: ");
		String username = sc.nextLine();

		System.out.print("Enter is password: ");
		String password = sc.nextLine();

		if (username.equals("hoidanit") && password.length() > 6) {
			System.out.println("valid");
		} else {
			System.out.println("Unvalid");
		}

		sc.close();

	}
}
