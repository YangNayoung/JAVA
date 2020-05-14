import java.util.Vector;

public class Product {
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}  // Product

class TV extends Product {

	public TV() {
		super(100);
	}
	public String toString() {
		return "TV";
	}
} // TV

class Computer extends Product{

	public Computer() {
		super(200);
	}
	public String toString() {
		return "Computer";
	}
} // Computer

class Audio extends Product {

	public Audio() {
		super(50);
	}
	public String toString() {
		return "Audio";
	}
} // Audio

class AIFreeze extends Product {

	public AIFreeze() {
		super(350);
	}
	public String toString() {
		return "AIFreeze";
	}
} // AIFreeze

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	// Product item[] = new Product[10];
	Vector item = new Vector();
	int i = 0;
	
	void buy(Product p) {
		if(money <p.price) {
			System.out.println("�ܾ��� �����մϴ�.");
			return ;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		//item[i++] = p;
		item.add(p);
		System.out.println(p + "��(��) �����ϼ̽��ϴ�.");
	} //buy
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("�����Ͻ� ��ǰ�� �����ϴ�.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i);
			sum += p.price;
			itemList += (i == 0) ? "" + p : ", " + p;
		}
		System.out.println("�����Ͻ� ��ǰ�� �� �ݾ��� " + sum + "�����Դϴ�.");
		System.out.println("���ʽ� ����Ʈ�� " + bonusPoint + "�����Դϴ�.");
		System.out.println("�����Ͻ� ��ǰ�� "+ itemList + "�Դϴ�.");
	} // summary
	
	public void refund(Product p) {
		if(item.remove(p)) {
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "��(��) ��ǰ�ϼ̽��ϴ�.");
		}
		else {
			System.out.println("�ش� ��ǰ�� �����ϴ�.");
		}
	} // refund
	
} // Buyer

