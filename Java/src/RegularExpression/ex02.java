package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ex02 {
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("(02|010)-\\d{3,4}-\\d{4}");// compile : ���� ǥ������ �������� ������
		String str = "010-0334-3214";
		
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.find());// find : ���ڿ����� ���ϰ� ��ġ�ϴ� �κ��� �ִ��� Ȯ��
		
	}
}