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
				System.out.println(); // 줄 바꿈
		}
	}
}

/* 정수 n을 입력받아 n줄의 숫자 탑 만들기
1
12
123
124
125
*/