class Phone {
	public String manufacturer;
	public String supervisor;
	public int price;
	public String communication;

	Phone (String manufacturer, int price, String communication) {
		this. manufacturer=manufacturer;
		this. price=price;
		this. communication=communication;
	}
}

class SmartPhone extends Phone {
	public String os;
	public String version;
	public String memory;
	public String camera;
	public String bluetooth;

	SmartPhone (String manufacturer, int price, String communication,  String os,  String version, String memory, String camera, String bluetooth) {
		super(manufacturer, price, communication);
		this. os=os;
		this. version=version;
		this. memory=memory;
		this. camera=camera;
		this. bluetooth=bluetooth;
	}
	public String toString() {  return "[������] "+manufacturer+" [����] "+price+" [���Ÿ��] "+communication+" [�ü��] "+os+" [����] "+version+" [�޸�] "+memory+" [ī�޶�] "+camera+" [�������] "+bluetooth; }
}

class Ex2 {
	public static void main(String ar[]) {
		SmartPhone s1=new SmartPhone("LG",120000,"3g","�ȵ���̵�","�ֽŹ���","ũ��","����","����");
		System.out.println(s1.toString());
	}
}