package Enum;

public class Developer {
	public String name;
	public int career;
	public DevType type;

	public static void main(String[] args) {
		for (DevType type : DevType.values()) {
			System.out.println(type.getName()+type.getName2());
		}
		
	}
	
}

enum DevType { 
	//상수("연관시킬 문자") <- 이땐 줄 끝에 세미콜론 (;) 붙이기. 
	MOBILE("안드로이드","Android"), 
	WEB("스프링","Spring"), 
	SERVER("리눅스","Linux"); 
	
	final private String name;
	final private String name2;
	public String getName() { 
		return name; 
	}
	public String getName2() {
		return name2;
	}
	
	private DevType(String name, String name2){ 
		this.name = name; 
		this.name2 = name2;
	} 
}
