class Customer extends Person8_1 {
	String number;
	int mileage;

	public Customer(String name, String addr, String tel, String number, int mileage) {
		super(name, addr, tel);
		this.number=number;
		this.mileage=mileage;
	}
	public String toString() { return super.toString()+ "[������ȣ]"+number+"[���ϸ���]"+mileage; }
}