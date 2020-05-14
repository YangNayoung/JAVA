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
		default : System.out.println("�߸� �Է��ϼ̽��ϴ�."); 
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
		System.out.print("�������� Circle(1), Line(2), Rect(3) >> ");
		int choose = sc.nextInt();
		switch (choose)
		{
		case 1: f[i].type = "Circle"; break;
		case 2: f[i].type = "Line"; break;
		case 3: f[i].type = "Rect"; break;
		default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}

	public void Delete() {
		System.out.print("������ ������ ��ġ >> ");
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
			System.out.print("����[1]  ����[2]  ��κ���[3]  ����[4] >> ");
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