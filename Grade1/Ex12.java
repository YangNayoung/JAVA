//1���� 100���� 3�� 5�� ������� ���

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
