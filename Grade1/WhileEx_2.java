// n, m�� �Է¹޾� n ~ m���� ¦����, Ȧ���� ���
import java. util.*;

class WhileEx_2{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int big=0;
		int small=0;
		int sum1=0;
		int sum2 =0;
		if (n>m) {
			big=n;
			small=m;
		}
		else if (n<m) {
			big=m;
			small=n;
		}
		else {
			System.out.println("���� �� �Դϴ�");
		}
		while (small<=big) {
			if (small%2==0) {
				sum1+=small;
			}
			else {
				sum2+=small;
			}
		small++;
	}
		System.out.println("¦����:"+sum1);
		System.out.println("Ȧ����:"+sum2);
	}
}
