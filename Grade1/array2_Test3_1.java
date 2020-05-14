/* 5명의 학번, 국, 영, 수 성적을  입력받아 총점 평균 석차 구하기 
  학번     국     영     수     총점     평균    석차(5*7) 내림차순*/

 import java.util.*;
class array2_Test3_1{
	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		int a[][]; // 배열 선언
		a= new int [5][7]; //배열 생성
		int temp=0;
	    for (int i=0;i<a.length ; i++ )
	    {
			System.out.print("학번: ");
			a[i][0]=sc.nextInt();
			System.out.print("국어: ");
			a[i][1]=sc.nextInt();
			System.out.print("영어: ");
			a[i][2]=sc.nextInt();
			System.out.print("수학: ");
			a[i][3]=sc.nextInt();
			System.out.println("=================================");
			a[i][4]=a[i][1]+a[i][2]+a[i][3]; // 총점
			a[i][5]=a[i][4]/3; // 평균
	    }
		for(int i=0;i<a.length;i++){       // 석차
			a[i][6]=1;
			for(int j=0;j<a.length;j++){
				if(a[i][5]<a[j][5]){
					a[i][6]++;
				 }
			}
		}
		System.out.println(" 학번  국어 영어 수학 총점 평균 석차 ");
		for (int i=0;i<a.length ;i++ )		
		{
			for (int j=0;j<a[i].length ;j++ )
			{
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}
	}
}