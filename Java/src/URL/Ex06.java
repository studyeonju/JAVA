
package URL;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Ex06 {
	public static void main(String[] args) {
		URLEncode();
	}
	public static void URLEncode() {
		String enUrl="";
			try {
				enUrl = URLEncoder.encode("연주!@#딸꾹질","UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			System.out.println("url인코딩결과:"+enUrl);
			URLDecode(enUrl);
	}
	
	public static void URLDecode(String enUrl) {
		String deUrl = "";
		try {
			deUrl = URLDecoder.decode(enUrl,"UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("url디코딩결과:"+deUrl);
	}
}
