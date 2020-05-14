import java.util.*;

interface starcraft {
	int MAX=100;
	int MIN=0;

	public void movable();
	public void attackable();
}

class Zerg implements starcraft {
	int x=0, y=0;
	public String color;

	Zerg(String color) {
		this.color=color;
	}
	public void movable() {
	}
	public void attackable() {
	}
}

class Terran implements starcraft {
	int x=0, y=0;
	public String color;

	Terran(String color) {
		this.color=color;
	}
	public void movable() {
		
	}
	public void attackable() {
	}
}

class Interface_ex1 {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Zerg z=new Zerg(sc.next());
		Terran t=new Terran(sc.next());
		while (true)
		{
			System.out.println("움직일 캐릭터를 선택하세요.");
			System.out.println("1. Zerg    2. Terran    3. 둘다");
			int choose = sc.nextInt();
			switch (choose)
			{
			case 1: z.movable();
			case 2: t.movable();
			case 3: z.movable(); t.movable();
			default: System.out.println("잘못 누르셨습니다. ");
			}
		}
	}
}