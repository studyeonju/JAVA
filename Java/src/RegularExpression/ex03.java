package RegularExpression;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ex03 {
	public static void main(String[] args) {
		
//		String str = "전화번호486";
		String str = "010-1234-3214----fdsfsd-3423-23423-----";
		String seq = "-";
		Pattern pattern = Pattern.compile(seq);
		String[] result = pattern.split(str);
		String[] result0 = pattern.split(str,0);  // limit = 0 일경우 zero length string 무시된다.
		String[] result1 = pattern.split(str,-1);// limit = 음수일때 zero length string 포함된다.
		String[] result2 = pattern.split(str,5); //limit = 양수 일때 배열의 최대개수는 5개 => limit의 수를 넘지 못함!
		
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result0));
		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));
//		System.out.println(matcher.find());// find : 문자열에서 패턴과 일치하는 부분이 있는지 확인
	}
}
