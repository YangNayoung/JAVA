// 2��~9�ܱ��� ������ ���(while 2��)

class WhileEx_4 {
	public static void main(String ar[]) {
		int i=2;
		while (i<=9)	{
			int j=1;
			while (j<=9)	{
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}
			System.out.println("********"+i+"��********");
			i++;
		}
	}
}

