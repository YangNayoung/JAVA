//1부터 100까지 3과 5의 공배수를 출력

import java.util.*;

class Ex12 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		for(int i=1;i<=100;i++) {
			if(i%3==0&&i%5==0) {
				System.out.println(i);
			}
		}
	}
}
