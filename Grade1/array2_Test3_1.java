/* 5���� �й�, ��, ��, �� ������  �Է¹޾� ���� ��� ���� ���ϱ� 
  �й�     ��     ��     ��     ����     ���    ����(5*7) ��������*/

 import java.util.*;
class array2_Test3_1{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a[][]; // �迭 ����
		a= new int [5][7]; //�迭 ����
		int temp=0;
	    for (int i=0;i<a.length ; i++ )
	    {
			System.out.print("�й�: ");
			a[i][0]=sc.nextInt();
			System.out.print("����: ");
			a[i][1]=sc.nextInt();
			System.out.print("����: ");
			a[i][2]=sc.nextInt();
			System.out.print("����: ");
			a[i][3]=sc.nextInt();
			System.out.println("=================================");
			a[i][4]=a[i][1]+a[i][2]+a[i][3]; // ����
			a[i][5]=a[i][4]/3; // ���
	    }
		for(int i=0;i<a.length;i++){       // ����
			a[i][6]=1;
			for(int j=0;j<a.length;j++){
				if(a[i][5]<a[j][5]){
					a[i][6]++;
				 }
			}
		}
		System.out.println(" �й�  ���� ���� ���� ���� ��� ���� ");
		for (int i=0;i<a.length ;i++ )		
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}