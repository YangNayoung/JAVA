// ���� n�� �Է¹ް� 1���� n���� ¦���� �հ� Ȧ���� �� ���
import java.util.*;

class NYteacher1 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int i= 1;
		int sum= 0, sum1= 0;

		while( i<=n ) {
			if( n%2==0 ) {
				sum+=n;
			}
				else {
					sum1+=n;
				}
				i++;
		}
		System.out.println("¦���� ��: " +sum);
		System.out.println("Ȧ���� ��: " +sum1);
		}
	}
