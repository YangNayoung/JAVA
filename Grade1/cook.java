import java.util.*;

class Product {
	public String name;
	public int price;
	public int count;

	public int getPrice() {
		return (price*count);
	}
	public void pr() {
		System.out.println("이름: "+name+", 가격: "+price); 
		}
}

class DiscountProduct extends Product {
	public int discount;
	
	public int getPrice() {
		
}