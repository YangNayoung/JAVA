// 4-3. 1+(1+2)+(1+2+3)+...+(1+2+3+...+10) °á°ú

class Homework_4 {
	public static void main(String ar[]) {
		int sum=0, total=0;
		for (int i=1;i<=10 ;i++ )
		{
			sum+=i;
			total+=sum;
		}
		System.out.println(total);
	}
}