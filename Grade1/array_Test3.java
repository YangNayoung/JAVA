// String을 이용하여 배열에 이름을 대입

class array_Test3 {
	public static void main(String ar[]) {
		String s[];
		s=new String[3];
		s[0]="Amy";
		s[1]="John";
		s[2]="Tom";
		for (int i=0;i<s.length ;i++ )
		{
			System.out.println(s[i]);
		}
}
}