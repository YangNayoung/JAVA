import java.io.*;

public class InExam {

	public static void main(String[] args) {
		String a = "", b = "";
		int sum = 0;
		float acerage = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Enter the string(�젙�닔) >");
			a = in.readLine();
			System.out.println("Enter the string(�젙�닔) >");
			b = in.readLine();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("Your input is " + a + ", "+b);
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		sum = c + d;
		float average = (float)sum/2;
		System.out.println(a+" + "+b+" = "+sum);
		System.out.println("�룊洹� = " + average);
	}

}
