// 123, 456 ������ �迭

import java.util.*;
class array2_Test1{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		// int a [][]= {{1,2,3},{4,5,6}}; ���� ���� ���ÿ� �Ͽ� k �ʿ� ����.
		int a[][]; // �迭 ����
		a= new int [2][3]; // �迭 ����
		int k=1;
		for (int i=0;i<a.length ;i++ )
		{
			for (int j=0;j<a[0].length ;j++ )
			{
				a[i][j]=k;
				System.out.print(a[i][j]+" ");
				k++;
			}
			System.out.println(" ");
		}
	}
}
				