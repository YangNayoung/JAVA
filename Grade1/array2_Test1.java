// 123, 456 이차원 배열

import java.util.*;
class array2_Test1{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		// int a [][]= {{1,2,3},{4,5,6}}; 선언 생성 동시에 하여 k 필요 없음.
		int a[][]; // 배열 선언
		a= new int [2][3]; // 배열 생성
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
				