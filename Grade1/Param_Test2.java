// ����� �Ű������� ���� 5���� �Է��� �� �ִ밪, �ּҰ��� ���Ͻÿ�

class Param_Test2 {
	public static void main(String ar[]) {
		int Max=0;
		int Min=999;
		for (int i=0;i<5 ;i++ )
		{
			System.out.print(ar[i]+" ");
			int a=Integer.parseInt(ar[i]);
			if (a>Max)
				Max=a;

			if(a<Min)
				Min=a;
		}
		System.out.println();
		System.out.println("�ִ밪 : "+Max);
		System.out.println("�ּҰ� : "+Min);
	}
}