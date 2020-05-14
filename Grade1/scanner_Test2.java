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

// n을 입력받아 숫자 출력
/*   5
      54
	  543
	  5432
	  54321
*/