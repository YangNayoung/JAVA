
public class AnimalMain {

	public static void main(String[] args) {
		Ani_Cow cow = new Ani_Cow();
//		System.out.println(cow.name() + " 는 " + cow.eat() + " 먹어 " + cow.action() + "에");
//		System.out.println();
		
		Ani_Lion Lion = new Ani_Lion();
//		System.out.println(Lion.name() + " 는 " + Lion.eat() + " 먹어 " + Lion.action() + "에");
//		System.out.println();
//		
//		System.out.println("=====별도의 클래스 사용=====");
		
		AnimalFind af = new AnimalFind();
		af.find(cow);
		af.find(Lion);
		
		Ani_Dog_Wolf dog = new Ani_Dog_Wolf();
		af.find(dog);
	}

}
