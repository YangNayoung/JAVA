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
		System.out.println("¦���� �� :"+sum);
	}
	}

	// ���� n�� �Է¹ް� 1���� n���� ¦���� �� ���
