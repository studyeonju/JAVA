package Try;

public class Ex04 {
	public static void main(String[] args) {
		try(Ex03 ex = new Ex03()){
			ex.action();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
