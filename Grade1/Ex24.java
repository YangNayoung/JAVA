// 한 개의 자연수를 입력받아 그 수의 배수를 차례로 10개 출력

import java.util.*;

class Ex24 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("그 수의 배수 10개");
		int a = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(a*i);
	}
	}
}
