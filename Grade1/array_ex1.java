/* ���� 5���� �Է� �޾Ƽ� ¦��, Ȧ���� �հ� ���.
���� ��)   ���� 5��? 1 2 3 4 5    ¦���� �� = 6, Ȧ���� �� = 9 */
import java. util.*;
class array_ex1 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int sum1=0,sum2=0;
		System.out.print("���� 5��? ");
		for (int i=0;i<a.length ;i++ )
		{
			a[i]= sc.nextInt();
			int A= Integer.parseInt(ar[i]);
			if(A%2==0)
				sum1+=A;
			else 
				sum2+=A;
		}
		System.out.println("¦���� �� = "+sum1);
		System.out.println("Ȧ���� �� = "+sum2);
	}
}
