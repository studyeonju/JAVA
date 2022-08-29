package Enum;

enum Currency {
	DOLLAR("달러",1300), EURO("유로",1300), YEN("엔화",980), YUAN("위안",190);
	private String name;
	private int value;

	private Currency(String name, int value) {
		this.name = name;
		this.value = value;
	}

	public int getVaule() {
		return value;
	}
	public String getName() {
		return name;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Currency c = Currency.valueOf("YEN");// Currency enum 에서 'YEN' 데이터 가져온다.
		System.out.println(c);
		Currency c1 = Currency.DOLLAR;
		System.out.println("이름 : "+c.name()); //열거형 상수의 이름을 반환
		System.out.println("ordinal : "+c.ordinal()); //열거형 상수의 정의된 순서값 반환 0부터 시작
		
		Currency[] lists = Currency.values();//열거상수 리스트 생성
		
		
		System.out.println(c.compareTo(Currency.DOLLAR));//인스턴스 값(YEN)이 DOLLAR 과 클 경우 => 2  
		System.out.println(c.compareTo(Currency.EURO));//인스턴스 값(YEN)이 EURO 과 클 경우 => 1 
		System.out.println(c.compareTo(Currency.YEN)); //인스턴스 값(YEN)이 YEN 과 같을 경우 => 0
		System.out.println(c.compareTo(Currency.YUAN));//인스턴스 값(YEN)이 YUAN 과 작을경우 경우 => -1
		
			for(Currency cur : lists) {
			System.out.println(cur.getName()+"," + cur.getVaule());
		}
	
		
		switch(c) {
		case DOLLAR:
			System.out.println(c.getName()+"환율은 "+c.getVaule()+"입니다");
			break;
		case EURO:
			System.out.println(c.getName() + "환율은 "+c.getVaule()+"입니다");
			break;
		case YEN:
			System.out.println(c.getName()+"환율은 "+c.getVaule()+"입니다");
			break;
		case YUAN:
			System.out.println(c.getName()+"환율은 "+c.getVaule()+"입니다");
			break;
		}
	}
}