package RegularExpression;


public class ex07 {
	public static void main(String[] args) {
		//replace()
		String str = "포도? 황도? 백도? 도토리? 도다리";
		System.out.println(str.replace("도", "★"));
		//replaceAll()
		String str2 = "포도? 황도? 백도? 도토리? 도다리";
		System.out.println(str2.replaceAll("도", "★"));
		
		System.out.println("-------------------------------------------");
		
		//replace()		
		String str1 = "포도@., 황도@., 백도@., 도토리@., 도다리@";
		System.out.println(str1.replace(".", "/"));
		//replaceAll()
		String str3 = "포도@., 황도@., 백도@., 도토리@., 도다리@";
		System.out.println(str3.replaceAll(".", "/"));
		
		
		String number = "dsfjknwenrw.?n2++3!12@3njsndjsa12sdfs09ddd042,2911///@";
		System.out.println(number.replaceAll("[^0-9]", ""));
		
	}
}

