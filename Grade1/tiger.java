class tiger extends Animal3 {
	tiger(int leg, String color, String owner) {
		this.leg=leg;
		this.color=color;
		this.owner=owner;
	}
	public String run() {
		return "�ٴ�";
	}
	public void eat(String food) {
		System.out.println(food+"�� �Դ�");
	}
}
