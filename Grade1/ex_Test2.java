class ex_Test2 {
	public static void main(String ar[]) {
		rabbit r=new rabbit(4,"pink","Alice");
		tiger t=new tiger(4,"white", "Mike");

		System.out.println(r.leg);
		System.out.println(r.color);
		System.out.println(r.owner);
		r.run();

		System.out.println(t.leg);
		System.out.println(t.color);
		System.out.println(t.owner);
		t.eat("°í±â");
	}
}