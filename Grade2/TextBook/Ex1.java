// String Ŭ����
public class Ex1 {

	public static void main(String[] args) {
	
		// 1. strData1�� 'I LOVE MIRIM MISTER'�� �Ҵ��� �� ���ڿ� ������ ����Ͻÿ�. (length)
			String strData1 ="I LOVE MIRIM MISTER";
		
			System.out.println("strData1.length() = "+ strData1.length());
			System.out.println();
			
		// 2. str1�� 'I LOVE MIRIM MISTER'�� �Ҵ��� ��  ����Ͻÿ�. (for,charAt())
			String str1 = "I LOVE MIRIM MISTER";
			for(int i=0; i<str1.length(); i++) {
				System.out.println(str1.charAt(i));
			}
			System.out.println();
			
		// 3. String ��ü R1, R2, R3�� ������ ��, ���� 'JAVA', 'JAVA, 'java'�� �Ҵ��Ͻÿ�.
			String R1 = new String("JAVA");
			String R2 = new String("JAVA");
			String R3 = new String("java");
			System.out.println("R1 == R2 --> " + (R1==R2));
			System.out.println("R1.equals(R2) --> " + (R1.equals(R2)));
			System.out.println("R1 == R3 --> " + (R1==R3));
			System.out.println("R1.equals(R3) --> " + (R1.equals(R3)));
			System.out.println();
			
		// 4. char�� ch�� 'A'�� �Ҵ��ϰ�, String�� str�� "A"�� �����Ͻÿ�. �׸��� ch���� String�� str2�� ������ ��, �� ������ ������ ���Ͽ� ����Ͻÿ�. (valueOf())
			char ch = 'A';
			String str = "A";
			String str2;
			str2 = String.valueOf(ch);
			if(str.equals(str2)) {
				System.out.println("����");
				System.out.println();
			}
			else {
				System.out.println("�ٸ�");
				System.out.println();
			}
			
		// 5. strData1�� 'I LOVE MIRIM MESTER'�� ������ �� ���� ���� �� ���� strData2�� �����Ͻÿ�. �׸��� �� ������ ������ ���Ͽ� ����Ͻÿ�. (trim())
			String strData2;
			strData2 = strData1.trim();
			System.out.println("strData2.trim() -> " +  strData2);
			if( strData1.contentEquals( strData2 )) {
				System.out.println("����");
				System.out.println();
			}
			else {
				System.out.println("�ٸ�");
				System.out.println();
			}
		// 6. strData1�� 'I LOVE MIRIM MESTER'�� �Ҵ� �� ��, MIRIM�� �����Ͽ� strData3�� ������ �� ����Ͻÿ�.
			String strData3;
			strData3 = strData1.substring(7,12);
			
			System.out.println("strData3.substring(7,12) ->" + strData3);
			System.out.println();

			
		// 7. strData1�� 'I LOVE MIRIM MESTER'�� �Ҵ� �� ��, LOVE�� �����Ͽ� strData4�� ������ �� ����Ͻÿ�.
			String strData4;
			strData4 = strData1.substring(2,5);
			
			System.out.println("strData3.substring(2,5) ->" + strData4);
			System.out.println();
			}
	}
 