import java.io.*;
import java.util.*;

public class Phone {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		FileWriter fw = null;
		File f = new File("Phone.txt");
		try {
			fw = new FileWriter(f); 
			System.out.println("��ȭ��ȣ �Է����α׷��Դϴ�.");
			while(true) {
				System.out.println("name PhoneNumber>> ");
				String line = scanner.nextLine();
				if(line.contentEquals("�׸�")) 
					break;
				fw.write(line +"\r\n");
			}
			System.out.println(f.getPath()+"�� ����Ǿ����ϴ�.");
			
			scanner.close();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
