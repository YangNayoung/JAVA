// 이름, 나이를 입력받아 5번 출력

import java.util.*;

class do_while_4 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 :");
		String name = sc.next();
		System.out.println("나이을 입력하세요 :");
		String age = sc.next();
		int i =1;
		do
		{
			System.out.println(name);
			System.out.println(age);
			i++;
		} while (i<=5);
}
}