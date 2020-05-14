import java.util.*;
class j1212 { 
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		String sub[]=new String[5];
		int sco[]=new int[5];
		int sum=0;
		float avg=0;
		int max=0;
		int min=999;
		
		System.out.println("5개의 과목명을 입력하세요>>:");
		for (int i=0;i<sub.length ;i++ )
		{
			sub[i]=sc.nextString();
			System.out.println(sub[i]);
		}
		System.out.println("=======================");
		System.out.println("5개의 점수를 입력하세요>>:");
		for (int i=0; i<sco.length; i++)
		{
			sco[i]=sc.nextInt();
			System.out.println(sco[i]);
			sum+=sco[i];
		}
		avg=sum/5;
		System.out.println("=======================");
		System.out.println("과목 총점>>"+sum);
		System.out.println("과목 평균>>"+avg);
		System.out.println("최고점수>>"+max);
		System.out.println("최저점수>>"+min);
		System.out.println("=======================");
	}
}