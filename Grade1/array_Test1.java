//  1. 100~999������ �� �� 6�� ����� �հ� ���� ���Ͻÿ�.

class Array_Test1 {
	public static void main(String ar[]) {
		int total=0, count=0;
		int a[ ]= new int [900];

		for(int i=0; i< 900; i++){
			a[ i ]=i+100;
		}
		for(int i=0; i< 900; i++){
			if ( a[i]%6==0 )
			{
				total+=a[i];
				count++;
			}
		}
		System.out.println("100~999���� 6�� ��� ��:  "+ total);
		System.out.println("100~999���� 6�� ��� ����:  "+ count);
	}
}