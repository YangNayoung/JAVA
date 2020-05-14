// String Buffer 클래스
public class Ex2 {

	public static void main(String[] args) {
		
		// 9.StringBuffer 객체 sb1에 java programming을 넣고, b2에 project를 넣은 후, sb1에 "project"문자열을 추가하여 str1에 넣고, sb1에 sb2를 추가하여 
		// str2에 대입한 후 출력하시오
			StringBuffer sb1 = new StringBuffer(" Java Programming");
			StringBuffer sb2 = new StringBuffer(" Project");
			String str23 = null;
			StringBuffer str1 = null;
			StringBuffer str2 = null;
			str1 = sb1.append(" Project");
			str2 = sb1.append(sb2);
			System.out.println("sb1 = " + sb1);
			System.out.println("sb2 = " + sb2);
			System.out.println("str1 = " + str1);
			System.out.println("str2 = " + str2);
			System.out.println();
				
		//10. StringBuffer 객체 sb1에 java programming을 생성한 후 java를 JAVA로 치환한 후 sb2에 할당한 후 출력하시오.
			sb2 = sb1.replace(0, 5, "JAVA");
			System.out.println("sb2 = " + sb2);
			System.out.println();
			
		//11. StringBuffer 객체 sb1에 java programming을 생성한 후 거꾸로 출력한 문자열을 sb3에 할당한 후 출력하시오.
			sb2 = sb1.reverse();
			System.out.println("sb2 = " + sb2);
			System.out.println();
			
		//12. StringBuffer 객체 sb1에 java programming을 생성한 후 모두 대문자로 출력하시오
			str23 = sb1.toString();
			System.out.println("str23.toUpperCase() = " + str23.toUpperCase());
			System.out.println();
	}

}
