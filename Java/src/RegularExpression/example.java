package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class example {

	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1.주민등록번호 2.이메일 3.휴대폰번호");
			int num = sc.nextInt();
			switch (num) {
			case 1: {
				numberCheck();
				break;
			}
			case 2: {
				emailCheck();
				break;
			}
			case 3: {
				phoneCheck();
				break;
			}
			default:
				System.out.println("다시입력해쥬세요");
			}
		}
	}

	private static void phoneCheck() {
		while (true) {
			Scanner phone = new Scanner(System.in);
			System.out.println("핸드폰 입력해주세요");
			String jumin = phone.next();
			String input = "^(01\\d{1})-\\d{3,4}-\\d{4}$";
			Pattern pattern = Pattern.compile(input);
			Matcher match = pattern.matcher(jumin);
			if (match.find()) {
				System.out.println("올바른 형식입니다.");
				// phone.close();
				return;
			} else {
				System.out.println("땡");
			}
		}
	}

	private static void emailCheck() {
		while (true) {
			Scanner email = new Scanner(System.in);
			System.out.println("이메일 입력해주세요");
			String jumin = email.next();
			String input = "^\\w+@[a-zA-Z]+(\\.+[a-zA-Z]+|\\.+[a-zA-Z]+\\.[a-zA-Z]+)$";
			Pattern pattern = Pattern.compile(input);
			Matcher match = pattern.matcher(jumin);
			if (match.find()) {
				System.out.println("올바른 형식입니다.");
				// phone.close();
				return;
			} else {
				System.out.println("땡");
			}
		}
	}

	private static void numberCheck() {
		while (true) {
			Scanner number = new Scanner(System.in);
			System.out.println("주민번호 입력해주세요");
			String jumin = number.next();
			String input = "^[\\d]{6}-[1-4][\\d]{6}$";
			Pattern pattern = Pattern.compile(input);
			Matcher match = pattern.matcher(jumin);
			if (match.find()) {
				System.out.println("올바른 형식입니다.");
//				number.close();
				return;
			} else {
				System.out.println("땡");
			}
		}
	}
}
