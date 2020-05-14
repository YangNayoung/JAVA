// 리턴 값 없고 매개변수 있고 두 수 사이의 합 구하기
class method_4_2 {
	public static void a(int x, int y, int sum) {
		for(int i=x; i<=y; i++){
			sum+=i;
		}
		System.out.println(x+" ~ "+y+" 두 수 사이의 합: "+sum);
	}
	public static void main(String ar[]) {
		method_4_2 m2 = new method_4_2();
		m2.a(1,5,0);
	}
}