class Food {
	private int calorie;
	private int price;
	private int weight;

	Food (int calorie, int price, int weight) {
		this. calorie=calorie;
		this. price=price;
		this. weight=weight;
	}
	public String toString() {  return "[Į�θ�] "+calorie+"kcal "+ "[����] "+price+"�� "+"[�߷�] "+weight+"kg"; }
}

class melon extends Food {
	public String farm;

	melon (int calorie, int price, int weight ,String farm) {
		super(calorie, price, weight);
		this.farm=farm;
	}
	public String toString() {  return super.toString()+ " [�������] "+farm;}
}

class Ex3 {
	public static void main(String ar[]) {
		melon m1=new melon(150,15000,1,"Good");
		System.out.println(m1.toString());
	}
}