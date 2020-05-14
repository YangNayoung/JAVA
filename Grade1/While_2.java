import java.util.*;

class While_2 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		int sum=0;
		while (i<=n)
		{
			if(i%2==0) {
				sum+=i;
		} //if
		i++;
		}//while
		System.out.println("짝수의 합 :"+sum);
	}
	}

	// 정수 n을 입력받고 1부터 n까지 짝수의 합 출력
