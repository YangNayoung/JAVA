// n�� �Է¹޾� 1~n���̿� 3�� ����̸鼭 5�� ����� �� ���

import java.util.*;

class do_while_2 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i = 1;
		do
		{
			if(i%3==0&&i%5==0) {
				System.out.println(i);
			}
			i++;
		} while (i<=n);
	}
}