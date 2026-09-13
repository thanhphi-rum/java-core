package Lab7;

public class TestLab7 {

	public static void main(String[] args) {
		SinhVien it1 = new SinhVienIT(10, 8);
		System.out.printf("Sinh viên IT1: %.2f điểm\n", it1.getDiem());

		SinhVien ck1 = new SinhVienCoKhi(9.5, 10);
		System.out.printf("Sinh viên CK1: %.2f điểm\n", ck1.getDiem());
	}

}
