package RegularExpression;

import java.util.regex.Pattern;

public class ex02 {
	public static void main(String[] args) {
		
		String regex = "(02|010)-\\d{3,4}-\\d{4}";
		
		Pattern pattern = Pattern.compile(regex);
		// compile : 정규 표현식을 패턴으로 컴파일 
		// String값으로 들어온 정규식을 Pattern 객체로 바꿔줍니다.
		
		System.out.println(pattern.pattern());
		//pattern 객체가 갖고 있는 정규식 pattern을 반환한는 method
	}
}
