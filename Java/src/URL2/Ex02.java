package URL2;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;



public class Ex02 {
	static URL url = null;
	static URLConnection conn = null;
	public static void main(String[] args) {
		try {
			url = new URL("http://localhost:8080/get2");
			conn = url.openConnection(); //해당 url에서 페이지 정보를 가져오기 위해서 URLConnection을 사용
			System.out.println("getContentLength:"+conn.getContentLength());
			System.out.println("getInputStream:"+conn.getInputStream());
			System.out.println("getURL:"+conn.getURL());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
