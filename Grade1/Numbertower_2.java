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
				System.out.println(); // 줄 바꿈
		}
	}
}

/* 정수 n을 입력받아 n줄의 숫자 탑 만들기
1234
2345
3456
4567
5678
*/