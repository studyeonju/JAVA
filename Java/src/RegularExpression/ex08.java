package RegularExpression;

public class ex08 {
	public static void main(String[] args) {
	String str = "hello feed wood hello world";
	//처음으로 만나는 문자만 변환
	System.out.println(str.replaceFirst("hello", "hi")); 
	System.out.println(str.replaceFirst("[a-z]", "1"));
	System.out.println(str.replaceFirst("d$", "D"));
	System.out.println(str.replaceFirst(".", "?"));
	}
}
