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
	String carNum; //차 넘버
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
			return ("차 번호 "+carNum+" 입니다.");
	}
}

class car3 extends Vehicle implements Movable {
	String yacht; //요트 등록번호
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
		return ("요트 등록번호  "+yacht+" 입니다.");
	}
}

class Interface_Car {
	public static void main(String ar[]) {
		

	}
}
