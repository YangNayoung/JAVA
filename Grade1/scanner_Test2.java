import java. util.*;

class scanner_Test2{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i=n ; i>=1 ; i-- )
		{
			for (int j=n ; j>=i ; j-- )
			{
				System.out.print(j);
			}
			System.out.println();
		}
}
}

// n�� �Է¹޾� ���� ���
/*   5
      54
	  543
	  5432
	  54321
*/