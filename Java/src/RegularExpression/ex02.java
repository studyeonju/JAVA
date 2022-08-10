package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex02 {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("(02|010)-\\d{3,4}-\\d{4}");// compile : 정규 표현식을 패턴으로 컴파일
		String str = "010-0334-3214";
		
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.find());// find : 문자열에서 패턴과 일치하는 부분이 있는지 확인
		
	}
}
