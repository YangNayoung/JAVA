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
		System.out.println("짝수의 갯수"+a);
		System.out.println("홀수의 갯수"+b);
}
}

// 10개의 정수를 입력받아 입력받은 수들 중 짝수의 갯수와 홀수의 갯수를 각각 구하여 출력