//  2. 1~100������ �� �� ¦���� �ո� ���

class Array_Test2 {
	public static void main(String ar[]) {
		int total=0;
		int a[ ]= new int [100];

		for(int i=0; i< 100; i++){
			a[ i ]=i+1;
		}
		for(int i=0; i< 100; i++){
			if ( a[i]%2==0 )
			{
				total+=a[i];
			}
		}
		System.out.println("1~100���� ¦���� ��:  "+ total);
	}
}