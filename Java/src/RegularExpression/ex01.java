package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex01 {
	public static void main(String[] args) {
		
		String str1 = "(02|010)-\\d{3,4}-\\d{4}";
		Pattern pattern = Pattern.compile(str1); //���� ǥ������ �������� ������
		String str2 = "010-1234-3214";
		
		Matcher matcher = pattern.matcher(str2);
		System.out.println(matcher.find());// ���ڿ����� ���ϰ� ��ġ�ϴ� �κ��� �ִ��� Ȯ��
				
		
	}
}