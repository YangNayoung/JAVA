//100-999���̿� 4�� ����� �ƴ� ������ ������ ���� ���Ͻÿ�

import java.util.*;

class Ex11 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		int count = 0;
		int sum=0;
		for(int i=100;i<=999;i++)
			if(i%4!=0) {
			sum=sum+i;
			count++;
	}
	System.out.println("4�� ����� �ƴ� ������ �� : "+sum);
	System.out.println("4�� ����� �ƴ� ������ ���� : "+count);
}
}