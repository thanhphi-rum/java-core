package Lab9;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SinhVien sv = new SinhVien();

		System.out.println("--- NHẬP THÔNG TIN SINH VIÊN ---");

		System.out.print("Nhập mã sinh viên: ");
		sv.setMasv(scanner.nextLine());

		System.out.print("Nhập họ tên: ");
		sv.setHoten(scanner.nextLine());

		// Xử lý ngoại lệ và bắt buộc nhập đúng cho Điểm
		while (true) {
			System.out.print("Nhập điểm (0 <= điểm <= 10): ");
			try {
				// Đọc cả dòng và ép kiểu để tránh trôi lệnh Scanner
				double inputDiem = Double.parseDouble(scanner.nextLine());
				if (inputDiem < 0 || inputDiem > 10) {
					System.out.println("Lỗi: Điểm phải nằm trong khoảng từ 0 đến 10. Vui lòng nhập lại!");
				} else {
					sv.setDiem(inputDiem);
					break; // Thoát vòng lặp khi dữ liệu hợp lệ
				}
			} catch (NumberFormatException e) {
				System.out.println("Lỗi ngoại lệ: Bạn phải nhập một số thực hợp lệ cho điểm!");
			}
		}

		// Xử lý ngoại lệ và bắt buộc nhập đúng cho Tuổi
		while (true) {
			System.out.print("Nhập tuổi (18 <= tuổi <= 100): ");
			try {
				int inputAge = Integer.parseInt(scanner.nextLine());
				if (inputAge < 18 || inputAge > 100) {
					System.out.println("Lỗi: Tuổi phải nằm trong khoảng từ 18 đến 100. Vui lòng nhập lại!");
				} else {
					sv.setAge(inputAge);
					break; // Thoát vòng lặp khi dữ liệu hợp lệ
				}
			} catch (NumberFormatException e) {
				System.out.println("Lỗi ngoại lệ: Bạn phải nhập một số nguyên hợp lệ cho tuổi!");
			}
		}

		// In ra màn hình bằng hàm toString
		System.out.println("\n--- THÔNG TIN ĐÃ NHẬP ---");
		System.out.println(sv.toString());

		scanner.close();
	}

}
