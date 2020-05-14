//  nÀ» ÀÔ·Â¹Þ¾Æ 1~n±îÁö 4ÀÇ ¹è¼ö Ãâ·Â --->µ¡¼À
import java. util.*;

class WhileEx_1{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=4;
		 while (i<=n) {
				System.out.println(i);
				i+=4;
		}
		}
}
/*  ³ª´°¼À
import java. util.*;
class WhileEx_1{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		 while (i<=n) {
			if(i%4==0) {
				System.out.println(i);
		}
		i++;
		}
	}
}
*/
