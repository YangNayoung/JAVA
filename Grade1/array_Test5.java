// Ű����κ��� 10���� ������ �Է¹޾� �迭 ���� �� �߿��� 3�� ����� ���� ��� ���

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