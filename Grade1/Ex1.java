class Wine {
	private String manufacturer;
	private String name;
	private String country;
	private String region;
	private String kind;
	private int year;
	private int grade;

	Wine (String manufacturer, String name, String country, String region, String kind) {
		this.manufacturer=manufacturer;
		this.name=name;
		this.country=country;
		this.region=region;
		this.kind=kind;
	}
	Wine (String manufacturer, String name) {
		this.manufacturer=manufacturer;
		this.name=name;
	}
	public void setYear(int year) { this.year=year; }
	public void setGrade(int grade) { this.grade=grade; }
	
	public String getManufacturer() { return manufacturer; }
	public String getName() { return name; }
	public String getCountry() { return country; }
	public String getRegion() { return region; }
	public String getKind() { return kind; }
	public int getYear() { return year=1998; }
	public int getGrade() { return grade=1; }
}

class Ex1{
	public static void main(String ar[]) {
		Wine w1=new Wine("Ä­Æ¼","¸ğ½ºÄ«Åä ´Ù½ºÆ¼", "ÀÌÅ»¸®¾Æ", "Piemonte", "È­ÀÌÆ®¿ÍÀÎ");
		Wine w2=new Wine("»ş¶Ç µşº¸","»ş¶Ç µşº¸ 2015");

		System.out.println(w1.getManufacturer()+" "+w1.getName()+" "+w1.getCountry()+" "+w1.getRegion()+" "+w1.getYear()+" "+w1.getGrade());
		System.out.println(w2.getManufacturer()+" "+w2.getName());
	}
}