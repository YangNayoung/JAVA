// ����� �ڽ��� ���� �Ҿƹ����� ��� ������ super ��� (������ �� ���� �켱����)

public class Myfamily {

	public static void main(String[] args) {
		
		//GrandFa gr = new GrandFa(); // �ƹ��͵� �� �ϸ� �⺻ �����ڸ� jvm�� ������
		//GrandFa gr = new GrandFa(50); // 1.�⺻ ������ ���� �����ϱ�,  2.�����ڸ� ��������� ��Ƽ�� ���� �ش�.
		// new ��ü ���� (GrandFa�� �������, �޼��� ��밡��, ���Ҿ� ������ �����ڱ���)
		
		Father father = new Father(); // GrandFa ���
		father.show();
		
		//gr.setNai(89); // �Ҿƹ��� ���� �ٲٱ�
		//System.out.println(gr.getNai()); // �Ҿƹ��� ���� �˷��ֱ�
		
		Me me = new Me(); // GrandFa�� Father ���
		
		GrandFa gr = new GrandFa();
		System.out.println("=================");
		System.out.println("���� "+gr.gabo); // �Ҿƹ��� ����
		System.out.println("���� "+gr.gahun); // �Ҿƹ��� ����
		System.out.println(gr.say()); //�Ҿƹ��� ����
		System.out.println();
		
		GrandFa gr1 = new GrandFa(88); // ������ ���ÿ� �ʱⰪ
		
		System.out.println("=====��ӽ���=====");
		System.out.println("�ƹ��� ���� "+father.getNai());
		System.out.println("�ƹ��� �� "+ father.getHouse());
		System.out.println("���� "+father.gahun);
		System.out.println(father.say());
		
		System.out.println();
		
		System.out.println("�� �� "+me.getHouse());
		System.out.println("���� "+me.gabo);
		System.out.println("���� "+ me.gahun);
		System.out.println(me.say());
		System.out.println(me.eat());
		
		me.biking();
		
		//father.biking()
		//gr.biking()
		
		 Father fal= new Me(); // ��ĳ����, ��Ӱ��迴�� ���� ���� (�������� ����) 
		 Me me1 = (Me)fal;
		
	}

}
