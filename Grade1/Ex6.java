//������ �Է¹޾Ƽ� 1���� �Է¹��� ���������� 5�� ����� �� ���

import java.util.*;

class Ex6 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b=0;
		for(int i=1;i<=a;i++) 
			if(i%5==0) {
			b=b+i;
	}
	System.out.println(b);
}
}