// ���� 2���� �� ���� �� ������ �� �� ���ϱ� (n~m)

class Param_Test6{
	public static void main(String ar[]) {
		 int n = Integer.parseInt(ar[0]);
		 int m = Integer.parseInt(ar[1]);
		 System.out.println(n+" ����"+m+" ������ ���� ��");
		 int sum=0;
		 do
		{
			 sum+=n;
			 n++;
		 } while (n<=m);
		 System.out.println("�� : "+sum);
		}
	}