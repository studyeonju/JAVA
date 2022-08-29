package Try;

import java.io.FileWriter;
import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		FileWriter f = null;
		try {
			f = new FileWriter("data.txt");
			f.write("Hello");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally { //무조건 실행 finllay 안에 close()메소드를 쓰면 예외와 관계없이 무조건 실행
			if(f !=null) {
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
