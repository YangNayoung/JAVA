interface Movable {
	public abstract void speedUp(int amount);
	public abstract void speedDown(int amount);
}

class Vehicle {
	int speed=50;
	public void setSpeed(int amount) {
	}
	public int getSpeed() {
		return speed;
	}
}

class car extends Vehicle implements Movable {
	String carNum; //�� �ѹ�
	public car(String carNum) {
		this.carNum=carNum;
	}
	public void speedUp(int amount) {
		speed+=amount;
	}
	public void speedDown(int amount) {
		speed-=amount;
	}
	public String toString() {
			return ("�� ��ȣ "+carNum+" �Դϴ�.");
	}
}

class car3 extends Vehicle implements Movable {
	String yacht; //��Ʈ ��Ϲ�ȣ
	public car3(String yacht) {
		this.yacht=yacht;
	}
	public void speedUp(int amount) {
		speed+=amount=6;
	}
	public void speedDown(int amount) {
		speed-=amount=6;
	}
	public String toString()  {
		return ("��Ʈ ��Ϲ�ȣ  "+yacht+" �Դϴ�.");
	}
}

class Interface_Car {
	public static void main(String ar[]) {
		

	}
}
