package Lab6;

import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args) {

		Student st1 = new Student("Nguyen Van A", "1");
		Student st2 = new Student("Le Van B", "2");
		Student st3 = new Student("Nguyen Van C", "3");
		Student st4 = new Student("Tran Van D", "4");
		Student st5 = new Student("Ly Van E", "5");

		ArrayList<Student> student = new ArrayList<>();
		student.add(st1);
		student.add(st2);
		student.add(st3);
		student.add(st4);
		student.add(st5);

		for (int i = 0; i < student.size(); i++) {
			System.out.printf("[%d] : %s\n", i + 1, student.get(i));
		}

		System.out.println("========================================");
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getName().startsWith("Nguyen")) {
				System.out.printf("[%d] : %s\n", i + 1, student.get(i));
			}
		}
	}
}
