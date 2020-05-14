// 리턴 값 있고 매개변수 없고
class Sum3 {
	public int sum() {
		int s = 1+2+3+4+5;
		return s;
}

	public static void main(String ar[]) {
		Sum3 s3 =new Sum3();
		int u = s3.sum();
		System.out.println(u);
	}
}