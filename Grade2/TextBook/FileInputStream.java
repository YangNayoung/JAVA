import java.io.*;

public class FileInputStream {

	public FileInputStream(String string) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		byte b[] =  new byte [6];
		try{
			FileInputStream fin = new FileInputStream("test.out");
			int n = 0, c;
			while((c = fin.read())!= -1) {
				b[n] = (byte)c;
				n++;
			}
			System.out.println("test.out���� ���� �迭�� ����մϴ�.");
			for(int i=0; i<b.length; i++)
				System.out.println(b[i]+" ");
			System.out.println();
			fin.close();
		} catch(IOException e) {
			System.out.println("test.out���� ���� ���߽��ϴ�." + "������ üũ�غ�����.");
		}
	}

	private int read() {
		// TODO Auto-generated method stub
		return 0;
	}

}
