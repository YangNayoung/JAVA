
public class AnimalFind {
	
//	public void find(Ani_Cow cow) {
//		System.out.println("���Ӿ��� �ϸ� �ϴ�" + cow.name() + " " + cow.eat() + " �Ծ� " + cow.action() + "��");
//	}
//	
//	public void find(Ani_Lion Lion) {
//		System.out.println(Lion.name() + " �� " + Lion.eat() + " �Ծ� " + Lion.action() + "��");
//		
//	} 
	
	public void find(Animal animal) {
		if(animal instanceof Ani_Cow) {
			System.out.println("���Ӿ��� �ϸ��ϴ�");
			System.out.println(animal.name() + "�� " + animal.eat() + " �Ծ� " + animal.action() + "��");
		}
		else if(animal instanceof Ani_Lion) {
			System.out.println("�糪�� �̻��� ����");
			System.out.println(animal.name() + "�� " + animal.eat() + " �Ծ� " + animal.action() + "��");
		}
		
		else if(animal instanceof Ani_Dog_Wolf) {
			System.out.println("�ֱ����� �Ϳ���");
			System.out.println(animal.name() + "�� " + animal.eat() + " �Ծ� " + animal.action() + "��");
		}
	}
}
