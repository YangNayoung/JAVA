/* �ΰ��� ���� �Է¹޾� �� ���� ���̿� 3�� ����̰ų� 7�� �����
 ������ �հ� ��� ���*/

 class Param_Test9 {
	 public static void main(String ar[]) {
		 int n = Integer.parseInt(ar[0]);
		 int m = Integer.parseInt(ar[1]);
		 System.out.println(n+" ����"+m+" ������ 3�� ����� 7�� ����� ������ �հ� ���");
		 int sum=0;
		 float avg=0,count=0;
		 do
		 {
		 if(n%3==0||n%7==0) {
			    count++;
				sum+=n;
				avg=sum/count;
			}
			n++;
		} while (n<=m);
		System.out.println("�� : "+sum);
		System.out.println("��� : "+avg);
	 }
 }