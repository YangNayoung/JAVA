import java.util.*;

abstract class Dobject {
	abstract public void draw();
}

class Figure_ex1 extends Dobject {
	String type; // circle, line, rect

	public void draw() {
		switch (type)
		{
		case "Circle": System.out.println("Circle"); break;
		case "Line": System.out.println("Line"); break;
		case "Rect": System.out.println("Rect"); break;
		default : System.out.println("잘못 입력하셨습니다."); 
		}
	}
}

class Menu {
	Scanner sc = new Scanner(System.in);
	Figure_ex1 f[] = new Figure_ex1[10];
	
	Menu() {
		for (int i=0; i<f.length; i++) {
			f[i] = new Figure_ex1();
		}
	}

	public void Insert(int i) {
		System.out.print("도형종류 Circle(1), Line(2), Rect(3) >> ");
		int choose = sc.nextInt();
		switch (choose)
		{
		case 1: f[i].type = "Circle"; break;
		case 2: f[i].type = "Line"; break;
		case 3: f[i].type = "Rect"; break;
		default: System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void Delete() {
		System.out.print("삭제할 도형의 위치 >> ");
		int d = sc.nextInt();
		f[d-1].type = " ";
	}

	public void View(int count) {
		for (int i=0; i<count ;i++ )
		{
			f[i].draw();
		}
	}

	public void Exit() {
		System.exit(0);
	}
}

class Figure {
	public static void main(String ar[]) {
		int count = 0;
		Menu m = new Menu();
		Scanner sc = new Scanner(System.in);

		while (true)
		{
			System.out.print("삽입[1]  삭제[2]  모두보기[3]  종료[4] >> ");
			int choice = sc.nextInt();
			switch (choice)
			{
			case 1: m.Insert(count);
						count++; 
						break;
			case 2: m.Delete(); 
						break;
			case 3: m.View(count);
						break;
			case 4: m.Exit();
						break;
			}
		}
	}
}