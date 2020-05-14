// 키보드에서 10개의 double을 입력받아 평균 출력

import java.util.*;
class array_Test8 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("10개의 수를 입력하세요:  ");
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
		System.out.println("평균: "+Aver);
	}
}
