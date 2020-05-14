/*100이하의 두개의 정수를 입력받아 작은 수부터 큰 수까지 차례대로 출력
예) 3, 8
   3,4,5,6,7,8
   8, 3
   */

class Param_Test7 {
	public static void main(String ar[]) {
		int a = Integer.parseInt(ar[0]);
		int b = Integer.parseInt(ar[1]);
		if(a<b) { 
			 for(int c=a; c<=b; c++) {
				 System.out.print(" "+c);
			 }
		}
			 else {
				 for(int c=b; c<=a; c++) {
				 System.out.print(" "+c);
				 }
			 }
	}
}