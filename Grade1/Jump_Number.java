// 1~100 ���Ҷ� 100�� �Ѵ� ���� ���ϱ�

class Jump_Number {
	public static void main(String ar[]) {
		int sum=0;
		int i=1;
		while (true) {
			sum+=i;
			if (sum>=100)
				break;
				i++;
			}
			System.out.println(i);
	}
}