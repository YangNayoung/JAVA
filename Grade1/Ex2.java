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
	public String toString() {  return "[제조사] "+manufacturer+" [가격] "+price+" [통신타입] "+communication+" [운영체제] "+os+" [버전] "+version+" [메모리] "+memory+" [카메라] "+camera+" [블루투스] "+bluetooth; }
}

class Ex2 {
	public static void main(String ar[]) {
		SmartPhone s1=new SmartPhone("LG",120000,"3g","안드로이드","최신버전","크다","있음","가능");
		System.out.println(s1.toString());
	}
}