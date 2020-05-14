//  2. 1~100사이의 수 중 짝수의 합만 출력

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
		System.out.println("1~100사이 짝수의 합:  "+ total);
	}
}