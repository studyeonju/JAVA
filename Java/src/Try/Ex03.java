package Try;

public class Ex03 implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("닫혔다");
	}
	public Ex03() {
		System.out.println("생성");
	}
	public void action() {
		System.out.println("...ing");
	}

}
