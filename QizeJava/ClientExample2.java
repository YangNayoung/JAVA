import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

//���ڿ� ������ ��_���� ����
public class ClientExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket socket = null;
		try{
			socket = new Socket("10.96.122.3", 9999);
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//����Ʈ ������ �����´ܾ ����Ʈ���� �ٷ� ���ڿ��� �ٲپ ���ڿ��� ���� ���� ���ۿ� �����Ͽ� �޴´�.
			//InputStream in = socket.getInputStream();
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			//OutputStream out = socket.getOutputStream();
			writer.println("�ȳ�?");
			//out.write(str.getBytes());
			writer.flush();
			//���ۿ� ���ڿ��� �� ���� �ʾƵ� ���ö����� ����
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