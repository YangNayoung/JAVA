//알파벳의 대문자를 소문자로 변환하여 출력

class WhileEx_3{
	public static void main(String ar[]) {
		int t = 0;
		int Ee=65;
		while (Ee<=90) {
			t=Ee+32;
			System.out.println((char)t);
			Ee++;
		}
	}
}
