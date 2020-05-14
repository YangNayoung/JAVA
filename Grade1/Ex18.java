//a+b=14를 만족하는 한자리 자연수 a,b를 모두 구하시오

class Ex18 {
	public static void main(String ar[]) {
		for(int a=0;a<=9;a++) {
			for(int b=0;b<=9;b++) {
				if(a+b==14) {
					System.out.println("a : "+a+"    b : "+b);
				}
			}
		}
	}
}
