package RegularExpression;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ex03 {
	public static void main(String[] args) {
		
//		String str = "��ȭ��ȣ486";
		String str = "010-1234-3214----fdsfsd-3423-23423-----";
		String seq = "-";
		Pattern pattern = Pattern.compile(seq);
		String[] result = pattern.split(str);
		String[] result0 = pattern.split(str,0);  // limit = 0 �ϰ�� zero length string ���õȴ�.
		String[] result1 = pattern.split(str,-1);// limit = �����϶� zero length string ���Եȴ�.
		String[] result2 = pattern.split(str,5); //limit = ��� �϶� �迭�� �ִ밳���� 5�� => limit�� ���� ���� ����!
		
		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(result0));
		System.out.println(Arrays.toString(result1));
		System.out.println(Arrays.toString(result2));
//		System.out.println(matcher.find());// find : ���ڿ����� ���ϰ� ��ġ�ϴ� �κ��� �ִ��� Ȯ��
	}
}
