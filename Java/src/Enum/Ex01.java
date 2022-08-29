package Enum;

public class Ex01 {
    public enum Season {
	    봄, 여름, 가을, 겨울
    }
	
    public static void main(String[] args) {
        Season season = Season.봄;
        System.out.println(season);
        System.out.print(Season.여름);
    }
}