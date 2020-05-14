// 리턴 값 있고 매개변수 있고
class Sum4 {
	public int sum(int a, int b, int c, int d, int f) {
		return (a+b+c+d+f);
}
	
	public static void main(String ar[]) {
		Sum4 s4 = new Sum4();
		int result = s4.sum(1,2,3,4,5);
		System.out.println(result);
	}
}