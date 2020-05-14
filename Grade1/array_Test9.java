// 사용자의 입력을 5개를 받아 오름차순 정렬(작은 곳이 맨 앞)

import java.util.*;
class array_Test9 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 5개의 수를 입력하세요");
		int temp;
		int a[];
		a=new int[5];

		for (int i = 0; i < a.length; i++)  
			 a[i]=sc.nextInt();

			 for (int i=0; i<4 ;i++ )
			 {
				 for (int j = i+1; j <a.length ; j++) {  
					 if (a[i] > a[j]) { 
						 temp = a[i];
						 a[i] = a[j];
						 a[j] = temp;
					 }
				 }
			 }
	System.out.println("오름차순 정렬");  
	for (int i = 0; i < a.length; i++) 
		System.out.print(a[i]+" ");
	}
}
