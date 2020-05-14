//"게임을 종료하시겠습니까?" 1누르면 종료, 0누르면 계속

import java.util.*;

class Ex7 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("게임을 종료하시겠습니까?");
		System.out.println(" 0은 계속 1은 종료");
		int a = sc.nextInt();
		if (a==1) {
			System.out.println("종료");
		}
		else if(a==0) {
			System.out.println("계속");
	}
	    else {
			System.out.println("잘못누르셨습니다.");
		}
}
}

