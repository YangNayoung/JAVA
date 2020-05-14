//100이하의 두개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력

class Parma_Test7{
	public static void main(String ar[]) {
		int a = Integer.parseInt(ar[0]);
		int b = Integer.parseInt(ar[1]);
		if(a<b) { 
			 for(int c=a; c<=b; c++) {
				 System.out.println(c);
			 }
		}
			 else {
				 for(int c=a; c<=b; c++) {
				 System.out.println(c);
				 }
			 }
	}
}