package Lab8;

public class TestLab8 {

	public static void main(String[] args) {
		Student st1 = new Student("123", "Thanh Phi", 20, 9);
		System.out.println(st1);
		st1.setGrade();
		System.out.println(st1);

		Person p1 = new Person("123", "Thanh", 20);
		System.out.println(p1);
	}

}
