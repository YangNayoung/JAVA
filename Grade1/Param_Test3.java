// ������ �Ű������� 5�� ���� �Է¹޾Ƽ� selection sort �ϱ� (��������)

class Param_Test3 {
	public static void main(String ar[]) {
		int  temp;
		int a[]=new int[5];
		for (int i = 0; i < 5; i++)  
		{
			 a[i]= Integer.parseInt(ar[i]);
			 System.out.print(" "+ar[i]);
		}
		System.out.println();
			 for (int i=0; i<4 ;i++ )
			 {
				 for (int j = i+1; j <a.length ; j++) {  
					 if (a[i] > a[j]) { 
						 temp = a[i];
						 a[i] = a[j];
						 a[j] = temp;
					 }
				 }
			 }
	System.out.println("�������� ����");  
	for (int i = 0; i < a.length; i++) 
		System.out.print(" "+a[i]);
	}
}