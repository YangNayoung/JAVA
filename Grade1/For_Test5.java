class For_Test5 {
public static void main(String ar[]) {

	int sum1=0, sum2=0;

	for (int i=1;i<=100 ;i++ ) {
		if (i%2==0) {
			sum1= sum1+i;
		}
		else {
			sum2=sum2+i;
	}
	}
	System.out.println("¦���� ����" + sum1);
	System.out.println("Ȧ���� ����" + sum2);
}
}