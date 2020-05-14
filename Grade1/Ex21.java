// 100이하의 자연수 n을 입력받고 n개의 정수를 입력받아 평균을 출력하는 프로그램

import java.util.*;

class Ex21 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int c=0;
     	if(n<=100){
		for(int i=1; 1>=n; i++){
			int b= sc.nextInt();
               c = c+b;
		}
		}
               System.out.println(c/n);
	}
}
