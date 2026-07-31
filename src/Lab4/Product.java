package Lab4;

import java.util.Scanner;

public class Product {

	private String name;
	private double price;
	private double tax;

	// Constructor
	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	// Getter - Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	// Method 1
	Scanner sc = new Scanner(System.in);

	public void nhapThongTin() {
		System.out.print("Nhap ten san pham: ");
		name = sc.nextLine();

		System.out.print("Nhap gia san pham: ");
		price = sc.nextDouble();

		System.out.print("Nhap thue: ");
		tax = sc.nextDouble();
	}

	// Method 2
	public void xuatThongTin() {
		System.out.println("Ten san pham: " + name);
		System.out.printf("Gia: %.3f\n", price);
		System.out.printf("Thue: %.3f\n", tax);
		System.out.printf("Tien thue: %.3f\n", getTaxPrice(price, tax));
	}

	// Method 3
	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}
}
