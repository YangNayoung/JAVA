interface Buyable {
	abstract public int getPrice();
}

class Television implements Buyable {
	public String model;
	public String maker;
	public int price;
	
	Television (String model, String maker, int price) {
		this.model=model;
		this.maker=maker;
		this.price=price;
	}

	public int getPrice() {
		return price;
	}
}

class TV_Interface {
	public static void main(String ar[]) {
		Television t1 = new Television("KV-102", "LG", 300);
		System.out.println(t1.model+" "+t1.maker+" "+t1.price);
	}
}
