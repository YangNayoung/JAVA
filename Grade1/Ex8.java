//100이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력

import java.util.*;

class Ex8 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("1개의 수 입력");
		int n = sc.nextInt();
		float c=0;
		System.out.println(n+"개의 점수 입력 ");
		for(int i=1; i<=n; i++){
			int b= sc.nextInt();
               c = c+b;
		}
               System.out.println("평균 : "+c/n);
	}
}