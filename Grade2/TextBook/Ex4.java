
public class Ex4 {

	public static void main(String[] args) {
		
		//17. 63/ -63/ 63.5/ -63.5�� ���밪�� ����Ͻÿ�.
			System.out.println(Math.abs(63));
			System.out.println(Math.abs(-63));
			System.out.println(Math.abs(63.5));
			System.out.println(Math.abs(-63.5));
			System.out.println();
				
		//18. 63/ 63.3/ 63.5/ -63.4/ -63.5/ -63.6�� round �Լ��� �Ἥ ����Ͻÿ�.
			System.out.println(Math.round(63));
			System.out.println(Math.round(63.3));
			System.out.println(Math.round(63.5));
			System.out.println(Math.round(-63.4));
			System.out.println(Math.round(-63.5));
			System.out.println(Math.round(-63.6));
			System.out.println();
				
		//19. 6 , 3 / 6.0f, 3.0f / 6.0 , 3.0 / -6.0 , 3.0 �� pow�Լ��� �Ἥ ����Ͻÿ�
			System.out.println(Math.pow(6, 3));
			System.out.println(Math.pow(6.0f, 3.0f));
			System.out.println(Math.pow(6.0, 3.0));
			System.out.println(Math.pow(-6.0, -3.0));
			System.out.println();
				
		//20. 9, 9.0f, 9.0, -9.0 �� �������� ���Ͻÿ�.
			System.out.println(Math.sqrt(9));
			System.out.println(Math.sqrt(9.0f));
			System.out.println(Math.sqrt(9.0));
			System.out.println(Math.sqrt(-9.0));
			System.out.println();
		
		// 21. �������� ���ϴ� random() �޼ҵ带 ����Ͽ� ������ ���Ͻÿ�.
			System.out.println(Math.random());
			System.out.println(Math.random());
			System.out.println((int)Math.random()*5);
			System.out.println((int)(Math.random()*5));
			System.out.println((int)Math.random()*10);
			System.out.println((int)(Math.random()*100));
			System.out.println();
	}

}
