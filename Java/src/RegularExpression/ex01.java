package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex01 {
	public static void main(String[] args) {
		
		String str1 = "(02|010)-\\d{3,4}-\\d{4}";
		Pattern pattern = Pattern.compile(str1); //정규 표현식을 패턴으로 컴파일
		String str2 = "010-1234-3214";
		
		Matcher matcher = pattern.matcher(str2);
		System.out.println(matcher.find());// 문자열에서 패턴과 일치하는 부분이 있는지 확인
				
		
	}
}
