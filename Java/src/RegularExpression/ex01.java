package RegularExpression;

import java.util.regex.Pattern;

public class ex01 {
	public static void main(String[] args) {
		
		String regex = "(02|010)-\\d{3,4}-\\d{4}";
		String input1 = "010-1234-3214";
		String input2 = "010-1234-3214abcd";
				
		System.out.println(Pattern.matches(regex, input1));
		System.out.println(Pattern.matches(regex, input2));
		
	}
}
