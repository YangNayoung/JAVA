//100������ �ڿ��� n�� �Է¹ް� n���� ������ �Է¹޾� ����� ���

import java.util.*;

class Ex8 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1���� �� �Է�");
		int n = sc.nextInt();
		float c=0;
		System.out.println(n+"���� ���� �Է� ");
		for(int i=1; i<=n; i++){
			int b= sc.nextInt();
               c = c+b;
		}
               System.out.println("��� : "+c/n);
	}
}