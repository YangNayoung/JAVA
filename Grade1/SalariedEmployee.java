class SalariedEmployee extends Employee1 {
	double salary;
	SalariedEmployee (String name, int num) {
		super(name, num);
	}
	public String toString() { return super.toString()+"[ПљБо]"+salary; }
}