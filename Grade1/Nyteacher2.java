//  두개의 정수를 입력받아 두 정수 사이에 5의 배수인 수들의 개수를 출력
import java.util.*;

class NYteacher2 {
	public static void main(String ar[]) {
		System.out.println(" 두개의 정수 입력 " );
		Scanner sc = new Scanner (System.in);

		int n = sc.nextInt();
		int n2 = sc.nextInt();
		int count = 0;

		while (n<=n2)
		{
			if (n%5==0)
			{
				count++;
			}
			n++;
		}
		System.out.println(" 입력한 두 정수 사이의 5의 배수 개수는 "+count+"개 입니다.");
	}
}

