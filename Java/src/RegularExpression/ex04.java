package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex04 {
	public static void main(String[] args) {
		String regex = "(02|010)-\\d{3,4}-\\d{4}";
		String str = "1231238ss";
		
		Pattern pattern = Pattern.compile(regex); // 패턴정의
		Matcher match = pattern.matcher(str); // 매치 되는 값을 저장
		
		while(match.find()) { //매치된값이 있으면 true 없으면 false
			System.out.println(match.group());// 매치된 값을 반환.
		} 
	}
}
