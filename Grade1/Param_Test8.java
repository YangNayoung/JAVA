// n,m�� �Է¹޾� n���� m������ ������ ����� ���Ͻÿ�

class Param_Test8 {
	public static void main(String ar[]) {
		 int n = Integer.parseInt(ar[0]);
		 int m = Integer.parseInt(ar[1]);
		 System.out.println(n+" ����"+m+" ������ ������ ���");
		 int sum=0;
		 float avg=0,count=0;
		 do
		 {
			 count++;
			 sum+=n;
			 avg=sum/count;
			 n++;
		 } while (n<=m);
		 System.out.println("��� : "+avg);
	}
}