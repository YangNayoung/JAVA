import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample1 {

	public static void main(String[] args) {
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9999);
			socket =  serverSocket.accept();
			
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			byte arr[] = new byte[100];
			in.read(arr);
			System.out.println(new String(arr));
			String str = "잘 있었니? 클라이언트";
			out.write(str.getBytes());
			
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