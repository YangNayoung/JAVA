import java.util.*;

class Ex22 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int a=0;
		int b=0;
		for (int i=1; i<=10 ; i++ )
		{
			int c = sc.nextInt();
		if(i%2==0) {
			a++;
			}
			if(i%2==1) {
				b++;
		}
		}
		System.out.println("¦���� ����"+a);
		System.out.println("Ȧ���� ����"+b);
}
}

// 10���� ������ �Է¹޾� �Է¹��� ���� �� ¦���� ������ Ȧ���� ������ ���� ���Ͽ� ���