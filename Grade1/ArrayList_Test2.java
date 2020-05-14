import java.util.*;

class ArrayList_Test2 {
	public static void main(String ar[]) {
		ArrayList<Integer> list2=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		int max=0;
		System.out.println("10개의 숫자를 입력하세요.");
		for (int i=0; i<10; i++) {
			list2.add(sc.nextInt());
		}
		for (int i=0; i<10; i++) {
			if (list2.get(i) > max) {
				max=list2.get(i);
			}
		}
		System.out.println("최대값 : "+max);
	}
}