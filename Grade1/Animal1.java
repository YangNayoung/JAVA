class Animal1 {
	private String name;
	private String owner;
	private int leg;

	Animal1(String name, String owner, int leg) {
		this.name=name;
		this.owner=owner;
		this.leg=leg;
	}
	Animal1(String name, String owner) {
		this.name=name;
		this.owner=owner;
	}
	Animal1(String owner, int leg) {
		this.owner=owner;
		this.leg=leg;
	}

	public void setName(String a) {
			System.out.println(a);
	}
	public void setOwner(String b) {
			System.out.println(b);
	}
	public String getName() {
		return name;
	}
	public String getOwner() {
		return owner;
	}

	public static void main(String ar[]) {
		Animal1 a1=new Animal1("cat", "mike", 4);
		Animal1 a2=new Animal1("dog", "alice");
		Animal1 a3=new Animal1("tom", 3);

		a3.setName("sheep");
		a2.setOwner("tomas");
		System.out.println(a3.getName());
		System.out.println(a2.getOwner());
	}
}