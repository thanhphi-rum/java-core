package Lab4;

public class TestProduct {
	public static void main(String[] args) {
		// Constructor
		Product pd1 = new Product();
		pd1.nhapThongTin();
		Product pd2 = new Product();
		pd2.nhapThongTin();
		//
		pd1.xuatThongTin();
		System.out.println("------------------");
		pd2.xuatThongTin();
	}
}
