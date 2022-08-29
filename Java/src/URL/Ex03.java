package URL;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Ex03 {
	static URL url = null;
	static URLConnection conn = null;
	public static void main(String[] args) {
		try {
			String param = "name=미니";
			URL url = new URL("http://localhost:8080/get2"+"?"+param);
			URLConnection conn = url.openConnection();
//			conn.setDoOutput(true); //서버와 통신에서 출경 가능한 상태로 만듬
//			OutputStreamWriter ow = new OutputStreamWriter(conn.getOutputStream());
//			
//			ow.write("FirstName=honghong&LastName=hong&age=50");
//			ow.close();
			
//			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//			String str ="";
//			while((str=in.readLine())!=null) {
//				System.out.println(str);
//			}
			System.out.println("@@@@"+conn.getURL());
		} catch (IOException e) {
			System.out.println("URL 데이터를 입출ㄹ력중에 오류가 발생");
			e.printStackTrace();
		}
		
	}
}
