import java.util.*;

class While_1 {
	public static void main(String ar[]) {
		Scanner sc= new Scanner(System.in);
		System.out.println("�� ��? :");
		int n= sc.nextInt();
		int i=1;
		while (i<=9)
		{
			System.out.println(n+ "*"+ i +"="+n*i);
			i++;
		}
				}
	}
	// ���� n�� �Է¹ް� ������ n���� ���
/*
int n=2
for(int i=1; i<=9; i++) {
	System.out.println(i*n);
	}
	*/