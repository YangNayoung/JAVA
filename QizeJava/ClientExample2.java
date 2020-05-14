import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

//문자열 단위로 송_수신 가능
public class ClientExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try{
			socket = new Socket("10.96.122.3", 9999);
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//바이트 단위로 들어오는단어를 바이트에서 바로 문자열로 바꾸어서 문자열로 들어온 것을 버퍼에 저장하여 받는다.
			//InputStream in = socket.getInputStream();
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			//OutputStream out = socket.getOutputStream();
			writer.println("안녕?");
			//out.write(str.getBytes());
			writer.flush();
			//버퍼에 문자열이 다 차지 않아도 들어올때마다 전송
			String str = reader.readLine();
			//byte arr[] = new byte[100];
			//in.read(arr);
			System.out.println(str);
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