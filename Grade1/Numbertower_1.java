import java.util.*;

class Numbertower_1 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for (int i=1; i<=n; i++ )
		{
			for (int a=1; a<=i ;a++ )
			{
				System.out.print(a);
				}
				System.out.println(); // �� �ٲ�
		}
	}
}

/* ���� n�� �Է¹޾� n���� ���� ž �����
1
12
123
124
125
*/