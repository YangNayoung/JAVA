// °¡À§¹ÙÀ§º¸

import java.util.*;

class Rock_Scissors_Paper {
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ã¶¼ö¿Í ¿µÈñ´Â °¡À§¹ÙÀ§º¸¸¦ ÇÕ´Ï´Ù. (°¡À§ , ¹ÙÀ§, º¸ Áß ¼±ÅÃ)");
		System.out.println("Ã¶¼ö:");
		String c = sc. next();
		System.out.println("¿µÈñ:");
		String y = sc. next();
		// µÑ´Ù °°Àº°Å ³¾ ¶§
		if (c.equals(y))
		{
			System.out.println("¹«½ÂºÎ");
		}
		// Ã¶¼ö°¡ °¡À§
		if (c.equals("°¡À§"))
		{
			if(y.equals("¹ÙÀ§"))
			{
				System.out.println("¿µÈñ ½Â");
			}
			else if(y.equals("º¸"))
			{
				System.out.println("Ã¶¼ö ½Â");
			}
			// Ã¶¼ö°¡ ¹ÙÀ§
		}
		if (c.equals("¹ÙÀ§"))
		{
			if(y.equals("º¸"))
			{
				System.out.println("¿µÈñ ½Â");
			}
			else if(y.equals("°¡À§"))
			{
				System.out.println("Ã¶¼ö ½Â");
			}
		}
		// Ã¶¼ö°¡ º¸
		if (c.equals("º¸"))
		{
			if(y.equals("°¡À§"))
			{
				System.out.println("¿µÈñ ½Â");
			}
			else if(y.equals("¹ÙÀ§"))
			{
				System.out.println("Ã¶¼ö ½Â");
			}
		}
	}
}