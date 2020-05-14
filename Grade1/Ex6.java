//정수를 입력받아서 1부터 입력받은 정수까지의 5의 배수의 합 출력

import java.util.*;

class Ex6 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b=0;
		for(int i=1;i<=a;i++) 
			if(i%5==0) {
			b=b+i;
	}
	System.out.println(b);
}
}