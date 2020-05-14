//Wrapper 클래스
public class Ex3 {

	public static void main(String[] args) {
		
		// 13. Integer객체 in1에 100, Integer객체 in2에 100, Integer객체 in3에 200을 넣고 in1과 in2의 값을 비교하고. in1과 in3룰 비교하여 출력하시오.
			Integer in1 = new Integer(100);
			Integer in2 = new Integer(100);
			Integer in3 = new Integer(200);
			System.out.println("in1.equals(in2)--> " + (in1.equals(in2)));
			System.out.println("in1.equals(in3)--> " + (in1.equals(in3)));
			System.out.println();
			
		// 14. Integer객체 wrapi생성하여 100을 넣고, Double객체 wrapd를 생성하여 55.7를 넣고 I=100, d=55.7인 상태에서 Integer.toString(i)+Double.toString(d)를
		// 계산하여 출력하시오. 또한 wrapi.toSting()+wrapd.toString()을 계산하여 출력하시오.
			Integer wrapi = new Integer(100);
			Double wrapd = new Double(55.7);
			int i = 100;
			double d = 55.7;
			System.out.println(i + d);
			System.out.println(Integer.toString(i) + Double.toString(d));
			System.out.println(wrapi.toString() + wrapd.toString());
			System.out.println();
		
		// 15. String형 stri=123456, std=123.56을 넣은 후 stri와 strd를 wrapper형으로 변환하여 출력하고, stri와 strd를 더한 결과를 출력하시오.
			String stri = "123456";
			String strd = "123.56";
			System.out.println(Integer.valueOf(stri));
			System.out.println(Double.valueOf(strd));
			System.out.println(Integer.valueOf(stri) + Double.valueOf(strd));
			System.out.println();
			
		// 16. String형 a=10, b=20을 넣은 후 합과 평균을 구하여 출력하시오. (평균: float)
			String a = "10", b = "20";
			int sum = 0;
			float average = 0;
			System.out.println("input data: " + a + " "  + b );
			int c = Integer.parseInt(a);
			int f = Integer.parseInt(b);
			sum = c + f;
			average = sum/2;
			System.out.println(a + " + " + b + " = " + sum);
			System.out.println("평균 = " + average);
			System.out.println();
		
	}

}
