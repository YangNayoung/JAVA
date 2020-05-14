class Ex17 {
	public static void main(String ar[]) {
		for(int i=2;i<=9;i++) {
			System.out.println("********"+i+"단********");
			for(int j=1;j<=9;j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
	}
}

//2단부터 9단까지 구구단 출력(단 끝날때마다 구분선 삽입)