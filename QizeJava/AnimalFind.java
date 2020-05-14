
public class AnimalFind {
	
//	public void find(Ani_Cow cow) {
//		System.out.println("끊임없이 일만 하는" + cow.name() + " " + cow.eat() + " 먹어 " + cow.action() + "에");
//	}
//	
//	public void find(Ani_Lion Lion) {
//		System.out.println(Lion.name() + " 는 " + Lion.eat() + " 먹어 " + Lion.action() + "에");
//		
//	} 
	
	public void find(Animal animal) {
		if(animal instanceof Ani_Cow) {
			System.out.println("끊임없이 일만하는");
			System.out.println(animal.name() + "는 " + animal.eat() + " 먹어 " + animal.action() + "에");
		}
		else if(animal instanceof Ani_Lion) {
			System.out.println("사나운 이빨을 가진");
			System.out.println(animal.name() + "는 " + animal.eat() + " 먹어 " + animal.action() + "에");
		}
		
		else if(animal instanceof Ani_Dog_Wolf) {
			System.out.println("애교많고 귀여운");
			System.out.println(animal.name() + "는 " + animal.eat() + " 먹어 " + animal.action() + "에");
		}
	}
}
