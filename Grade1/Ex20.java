/* 정수를 입력받아서 별 출력
예시) n=3이면;
 * * *
 * *
 *
 */

import  java.util.*;

class Ex20 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt();
		for(int i=number; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}