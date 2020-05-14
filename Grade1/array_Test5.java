// 키보드로부터 10개의 정수를 입력받아 배열 저장 이 중에서 3의 배수인 수만 골라 출력

import  java. util.*;
class array_Test5 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int a[];
		a=new int[10];
		for (int i=0 ; i<a.length ; i++)
		{
			int n=sc.nextInt();
			if (n%3==0)
			{
				a[i] = n;
				System.out.println(a[i]);
			}
		}
	}
}