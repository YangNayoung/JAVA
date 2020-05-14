class Person8_1 {
	private String name;
	private String addr;
	private String tel;

	public Person8_1(String name, String addr, String tel) {
		this.name=name;
		this.addr=addr;
		this.tel=tel;
	}
	
	public void setName(String name) { this.name=name; }
	public void setAddr(String addr) { this.addr=addr; }
	public void serTel(String tel) { this.tel=tel; }

	public String getName() { return name; }
	public String getAddr() { return addr; }
	public String getTel() { return tel; }
	public String toString() { return "[이름]"+name+"[주소]"+addr+"[전번]"+tel; }
}