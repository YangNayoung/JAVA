// 정수 n을 입력받고 1부터 n까지 짝수의 합과 홀수의 합 출력
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
		System.out.println("짝수의 합: " +sum);
		System.out.println("홀수의 합: " +sum1);
		}
	}
