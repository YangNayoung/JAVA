import java.util.*;

class Numbertower_2 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for (int i=1; i<=n; i++ )
		{
			for (int j=i; j<=i+3 ;j++ )
			{
				System.out.print(j);
				}
				System.out.println(); // �� �ٲ�
		}
	}
}

/* ���� n�� �Է¹޾� n���� ���� ž �����
1234
2345
3456
4567
5678
*/