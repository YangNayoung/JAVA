class Customer extends Person8_1 {
	String number;
	int mileage;

	public Customer(String name, String addr, String tel, String number, int mileage) {
		super(name, addr, tel);
		this.number=number;
		this.mileage=mileage;
	}
	public String toString() { return super.toString()+ "[고객번호]"+number+"[마일리지]"+mileage; }
}