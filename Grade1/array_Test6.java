// 사용자의 입력을 5개를 받아서 최대값 출력

import java.util.*;
class array_Test6 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int a[];
		a=new int[5];
		int Max=0;
		for (int i=0 ; i<a.length ; i++)
		{
			a[i]=sc.nextInt();
			if (a[i]>Max)
			{
				Max=a[i];
			}
		}
		System.out.println("최대값: "+Max);
	}
}