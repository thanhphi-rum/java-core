package Lab6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExampleRegexEx {
	public static void main(String[] args) {

		Pattern password = Pattern.compile("[0-9]{6,}");
		Matcher testPassword = password.matcher("1234567");
		System.out.println("Check password: " + testPassword.matches());

		Pattern CCCD = Pattern.compile("[0-9]{12}");
		Matcher testCCCD = CCCD.matcher("079206027956");
		System.out.println("Check CCCD: " + testCCCD.matches());

		Pattern email = Pattern.compile("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]{2,4}");
		Matcher testEmail = email.matcher("thanhphi400@gmail.com");
		System.out.println("Check email: " + testEmail.matches());
	}
}
