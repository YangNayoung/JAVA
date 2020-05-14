// 1. 변수 num이 337이면 331로 772면 771로 바꾸시오.

import java. util.*;

class Homework_1{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((num/10)*10+1);
	}
}