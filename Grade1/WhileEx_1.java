//  n�� �Է¹޾� 1~n���� 4�� ��� ��� --->����
import java. util.*;

class WhileEx_1{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=4;
		 while (i<=n) {
				System.out.println(i);
				i+=4;
		}
		}
}
/*  ������
import java. util.*;
class WhileEx_1{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		 while (i<=n) {
			if(i%4==0) {
				System.out.println(i);
		}
		i++;
		}
	}
}
*/
