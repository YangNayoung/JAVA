// String 클래스
public class Ex1 {

	public static void main(String[] args) {
	
		// 1. strData1에 'I LOVE MIRIM MISTER'를 할당한 후 문자열 개수를 출력하시오. (length)
			String strData1 ="I LOVE MIRIM MISTER";
		
			System.out.println("strData1.length() = "+ strData1.length());
			System.out.println();
			
		// 2. str1에 'I LOVE MIRIM MISTER'를 할당한 후  출력하시오. (for,charAt())
			String str1 = "I LOVE MIRIM MISTER";
			for(int i=0; i<str1.length(); i++) {
				System.out.println(str1.charAt(i));
			}
			System.out.println();
			
		// 3. String 객체 R1, R2, R3를 생성한 후, 각각 'JAVA', 'JAVA, 'java'를 할당하시오.
			String R1 = new String("JAVA");
			String R2 = new String("JAVA");
			String R3 = new String("java");
			System.out.println("R1 == R2 --> " + (R1==R2));
			System.out.println("R1.equals(R2) --> " + (R1.equals(R2)));
			System.out.println("R1 == R3 --> " + (R1==R3));
			System.out.println("R1.equals(R3) --> " + (R1.equals(R3)));
			System.out.println();
			
		// 4. char형 ch에 'A'를 할당하고, String형 str에 "A"를 대입하시오. 그리고 ch값을 String형 str2에 대입한 후, 두 내용이 같은지 비교하여 출력하시오. (valueOf())
			char ch = 'A';
			String str = "A";
			String str2;
			str2 = String.valueOf(ch);
			if(str.equals(str2)) {
				System.out.println("같음");
				System.out.println();
			}
			else {
				System.out.println("다름");
				System.out.println();
			}
			
		// 5. strData1에 'I LOVE MIRIM MESTER'를 대입한 후 공백 제거 한 값을 strData2에 대입하시오. 그리고 두 내용이 같은지 비교하여 출력하시오. (trim())
			String strData2;
			strData2 = strData1.trim();
			System.out.println("strData2.trim() -> " +  strData2);
			if( strData1.contentEquals( strData2 )) {
				System.out.println("같음");
				System.out.println();
			}
			else {
				System.out.println("다름");
				System.out.println();
			}
		// 6. strData1에 'I LOVE MIRIM MESTER'를 할당 한 후, MIRIM만 추출하여 strData3에 대입한 후 출력하시오.
			String strData3;
			strData3 = strData1.substring(7,12);
			
			System.out.println("strData3.substring(7,12) ->" + strData3);
			System.out.println();

			
		// 7. strData1에 'I LOVE MIRIM MESTER'를 할당 한 후, LOVE만 추출하여 strData4에 대입한 후 출력하시오.
			String strData4;
			strData4 = strData1.substring(2,5);
			
			System.out.println("strData3.substring(2,5) ->" + strData4);
			System.out.println();
			}
	}
 