// Ű���忡�� 10���� double�� �Է¹޾� ��� ���

import java.util.*;
class array_Test8 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("10���� ���� �Է��ϼ���:  ");
		double d[];
		d=new double[10];
		double sum=0;
		double Aver=0;

		for (int i=0 ; i<d.length ; i++)
		{
			d[i]=sc.nextInt();
			sum+=d[i];
		}
		Aver=sum/d.length;
		System.out.println("���: "+Aver);
	}
}
