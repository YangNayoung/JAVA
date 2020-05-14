/* 정수 5개를 입력 받아서 짝수, 홀수별 합계 출력.
실행 예)   숫자 5개? 1 2 3 4 5    짝수의 합 = 6, 홀수의 합 = 9 */
import java. util.*;
class array_ex1 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum1=0,sum2=0;
		System.out.print("숫자 5개? ");
		for (int i=0;i<a.length ;i++ )
		{
			a[i]= sc.nextInt();
			int A= Integer.parseInt(ar[i]);
			if(A%2==0)
				sum1+=A;
			else 
				sum2+=A;
		}
		System.out.println("짝수의 합 = "+sum1);
		System.out.println("홀수의 합 = "+sum2);
	}
}
