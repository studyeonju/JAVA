package Enum;

public class Ex02 {
	public static final String DOG ="dog";
	public static final String CAT ="cat";
	public static void main(String[] args) {
		String animal;
		
		animal = Ex02.DOG;
		animal = Ex02.CAT;
		animal="bear";
		
		Animal animal2;
		animal2 = Animal.DOG;
		animal2 = Animal.CAT;
		animal2= Animal.BEAR; // Type mismatch: cannot convert from String to Gender
		System.out.println(animal2);
		
	}
}

   enum Animal{
	DOG,CAT;
}
 