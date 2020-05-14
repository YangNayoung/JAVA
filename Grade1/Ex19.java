//1과 100사이의 정수중 3의 배수이면서 5의배수도, 9의 배수도 아닌 수를 모두 출력

class Ex19 {
	public static void main(String ar[]) {
		for(int i=1;i<=100;i++)
			if(i%3!=0&&i%5!=0&&i%9!=0) {
			System.out.println(i);
		}
	}
}


