import java.util.*;

class Product {
	private String name;
	private int price;
	private int count;

	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public void setCount(int count) {
		this.count=count;
	}
	public String getName(){
		return name;
	}
	public int getCount() {
		return count;
	}
	public int getPrice() {
		return (price*count);
	}
	public void pr() {
		System.out.println("�̸�: "+name+", ����: "+price); 
		}
	public void toString() {
		System.out.println("�̸�: "+name+", ����: "+price);
	}
}

class DiscountProduct extends Product {
	private int discount;

	public int getDiscount() {
		return discount;
	}
	public void pr() {
		System.out.println("�̸�: "+name+", ����: "+discount);
	}
}

class Mart {
	public static void main(String ar[]) {
		Scanner sc=new Scanner(System.in);
		Product p=new Product();
		DiscountProduct d=new DiscountProduct();

		System.out.println("�Է�: ");

	}
}