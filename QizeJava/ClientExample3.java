import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientExample3 {

	public static void main(String[] args) {
		
		Socket socket =null;
		
		try{
			socket = new Socket("10.96.122.3", 9999);
			Thread thread1 = new 
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				socket.close();
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
