import java.util.*;
class j1212 { 
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		String sub[]=new String[5];
		int sco[]=new int[5];
		int sum=0;
		float avg=0;
		int max=0;
		int min=999;
		
		System.out.println("5���� ������� �Է��ϼ���>>:");
		for (int i=0;i<sub.length ;i++ )
		{
			sub[i]=sc.nextString();
			System.out.println(sub[i]);
		}
		System.out.println("=======================");
		System.out.println("5���� ������ �Է��ϼ���>>:");
		for (int i=0; i<sco.length; i++)
		{
			sco[i]=sc.nextInt();
			System.out.println(sco[i]);
			sum+=sco[i];
		}
		avg=sum/5;
		System.out.println("=======================");
		System.out.println("���� ����>>"+sum);
		System.out.println("���� ���>>"+avg);
		System.out.println("�ְ�����>>"+max);
		System.out.println("��������>>"+min);
		System.out.println("=======================");
	}
}