//두 개의 정수를 입력받아 두 개 정수 사이에서 3의 배수이거나 5의 배수인 수들의  합과 평균을 출력

import java.util.*;

class Ex23 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("두 정수를 입력---> 2개의 사이의 3의 배수이거나 5의배수 합, 평균 출력");
	    int a = sc.nextInt();
		int b = sc.nextInt();
		int sum=0;
		int Aver=0;
		int count=0;
		for (int i=a; i<=b ; i++ )
		{
		if(i%3==0 || i%5==0) {
			sum=sum+i;
			count++;
			//Aver=sum/count;
	}
		}
		System.out.println("합"+sum);
		Aver=sum/count;
		System.out.println("평균"+Aver);
	}
}