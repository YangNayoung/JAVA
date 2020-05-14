// 3 6 9 ∞‘¿” 

class Games_3_6_9 {
	public static void main(String ar[]) {
		for (int i=1;i<=100 ;i++ )
		{
			if(i/10==3||i/10==6||i/10==9) {
				System.out.println(i+" π⁄ºˆ ¬¶");
				if(i%10==3||i%10==6||i%10==9) {
					System.out.println(i+"π⁄ºˆ ¬¶¬¶");
				}
			}
			System.out.println(i);
		}
	}
}
