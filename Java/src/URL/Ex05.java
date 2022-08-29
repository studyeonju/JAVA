package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Ex05 {
	
	public static void main(String[] args) {
		Ex05 http = new Ex05();
		try {
			http.sendGet("https://www.google.co.kr/");
			
//			System.out.println("POST로 데이터 가져오기");
//      		String urlParameters = "sn=C02G8416DRJM&num=12345";
      	//	http.sendPost("https://www.google.co.kr/", urlParameters);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/*
	 * private Proxy initProxy(String ip, int port) {
	 * 
	 * return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
	 * 
	 * }
	 */
	
	private void sendGet(String targetUrl) throws IOException {
		URL url = new URL(targetUrl);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setConnectTimeout(10000); //접속되기 전까지의 기다리는 시간
		conn.setReadTimeout(5000); // 접속되고 응답을 받기까지 기다리는 시간
		
		int responeCode = conn.getResponseCode();
		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
		while((inputLine=in.readLine())!=null) {
			response.append(inputLine);
		}
		in.close();
		
		System.out.println("HTTP응답코드" + responeCode);
		System.out.println("HTTP body:" + response.toString());
	}
	
//	private void sendPost(String targetUrl,String parameters) throws IOException {
//		System.out.println("!!");
//		Proxy proxy = initProxy("192.168.0.1", 8888);
//		URL url = new URL(targetUrl);
//		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection(proxy);
//		
//		conn.setRequestMethod("POST");
//		conn.setDoOutput(true);
//		
//		conn.setConnectTimeout(10000);       //컨텍션타임아웃      
//		conn.setReadTimeout(5000);    
//		DataOutputStream dos = new DataOutputStream(conn.getOutputStream());
//		dos.writeBytes(parameters);
//		dos.flush();
//		dos.close();
//		
//		int responseCode = conn.getResponseCode();
//		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//		String inputLine;
//		StringBuffer response = new StringBuffer();
//		while((inputLine=in.readLine())!=null) {
//			response.append(inputLine);
//		}
//		in.close();
//		System.out.println("HTTP응답코드:"+responseCode);
//		System.out.println("HTTP body :"+response.toString());
//		
//		
//		
//	}
}
