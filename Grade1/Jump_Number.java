// 1~100 더할때 100이 넘는 숫자 구하기

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