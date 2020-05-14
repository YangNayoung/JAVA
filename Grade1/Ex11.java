//100-999사이에 4의 배수가 아닌 수들의 갯수와 합을 구하시오

import java.util.*;

class Ex11 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int count = 0;
		int sum=0;
		for(int i=100;i<=999;i++)
			if(i%4!=0) {
			sum=sum+i;
			count++;
	}
	System.out.println("4의 배수가 아닌 수들의 합 : "+sum);
	System.out.println("4의 배수가 아닌 수들의 갯수 : "+count);
}
}