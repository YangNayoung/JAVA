// 2. (È­¾¾¿Âµµ - 32) / 1.8 = ¼·¾¾¿Âµµ ÀÌ°í È­¾¾¿Âµµ°¡ 100µµ ÀÏ¶§ ¼·¾¾¿Âµµ ±¸ÇÏ±â

import java.util.*;
class Homework_2 {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		float h = sc.nextFloat();
		double s=0;
		s= (h - 32) / 1.8;
		System.out.println("È­¾¾¿Âµµ°¡ "+h+"µµÀÏ ¶§ ¼·¾¾¿Âµµ : "+s);
	}
}