//Wrapper Ŭ����
public class Ex3 {

	public static void main(String[] args) {
		
		// 13. Integer��ü in1�� 100, Integer��ü in2�� 100, Integer��ü in3�� 200�� �ְ� in1�� in2�� ���� ���ϰ�. in1�� in3�� ���Ͽ� ����Ͻÿ�.
			Integer in1 = new Integer(100);
			Integer in2 = new Integer(100);
			Integer in3 = new Integer(200);
			System.out.println("in1.equals(in2)--> " + (in1.equals(in2)));
			System.out.println("in1.equals(in3)--> " + (in1.equals(in3)));
			System.out.println();
			
		// 14. Integer��ü wrapi�����Ͽ� 100�� �ְ�, Double��ü wrapd�� �����Ͽ� 55.7�� �ְ� I=100, d=55.7�� ���¿��� Integer.toString(i)+Double.toString(d)��
		// ����Ͽ� ����Ͻÿ�. ���� wrapi.toSting()+wrapd.toString()�� ����Ͽ� ����Ͻÿ�.
			Integer wrapi = new Integer(100);
			Double wrapd = new Double(55.7);
			int i = 100;
			double d = 55.7;
			System.out.println(i + d);
			System.out.println(Integer.toString(i) + Double.toString(d));
			System.out.println(wrapi.toString() + wrapd.toString());
			System.out.println();
		
		// 15. String�� stri=123456, std=123.56�� ���� �� stri�� strd�� wrapper������ ��ȯ�Ͽ� ����ϰ�, stri�� strd�� ���� ����� ����Ͻÿ�.
			String stri = "123456";
			String strd = "123.56";
			System.out.println(Integer.valueOf(stri));
			System.out.println(Double.valueOf(strd));
			System.out.println(Integer.valueOf(stri) + Double.valueOf(strd));
			System.out.println();
			
		// 16. String�� a=10, b=20�� ���� �� �հ� ����� ���Ͽ� ����Ͻÿ�. (���: float)
			String a = "10", b = "20";
			int sum = 0;
			float average = 0;
			System.out.println("input data: " + a + " "  + b );
			int c = Integer.parseInt(a);
			int f = Integer.parseInt(b);
			sum = c + f;
			average = sum/2;
			System.out.println(a + " + " + b + " = " + sum);
			System.out.println("��� = " + average);
			System.out.println();
		
	}

}
