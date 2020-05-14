// 10 이하의 자연수 n을 입력받아 "Daniel"을 n번 출력

import java.util.*;

class array_ex6 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("10이하의 정수 입력:");
		int n = sc.nextInt();
        if(n<=10) {
			for(int  i=1; i<=n; i++) {
			System.out.println("Daniel");
			}
		}
	}
}