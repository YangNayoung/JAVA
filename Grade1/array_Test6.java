// ������� �Է��� 5���� �޾Ƽ� �ִ밪 ���

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
		System.out.println("�ִ밪: "+Max);
	}
}