
public class AnimalMain {

	public static void main(String[] args) {
		Ani_Cow cow = new Ani_Cow();
//		System.out.println(cow.name() + " �� " + cow.eat() + " �Ծ� " + cow.action() + "��");
//		System.out.println();
		
		Ani_Lion Lion = new Ani_Lion();
//		System.out.println(Lion.name() + " �� " + Lion.eat() + " �Ծ� " + Lion.action() + "��");
//		System.out.println();
//		
//		System.out.println("=====������ Ŭ���� ���=====");
		
		AnimalFind af = new AnimalFind();
		af.find(cow);
		af.find(Lion);
		
		Ani_Dog_Wolf dog = new Ani_Dog_Wolf();
		af.find(dog);
	}

}
