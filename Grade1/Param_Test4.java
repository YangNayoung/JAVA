// 명령행 매개변수로 2개의 값을 입력받아서 두 개 값 사이의 합 구하기 

class Param_Test4 {
	public static void main(String ar[]) {
		 int n = Integer.parseInt(ar[0]);
		 int m = Integer.parseInt(ar[1]);
		 System.out.println(n+" 부터"+m+" 사이의 수들");
		 do
		 {
			 System.out.print(" "+n);
			 n++;
		 } while (n<=m);
	}
}