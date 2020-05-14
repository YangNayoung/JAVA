import java.util.Random;
import java.util.Scanner; 

public class Up_Down_Bot {
	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		//makeGuess strar ~ end 까지 랜덤
		Random random = new Random();
		while (true) {
			// int guess =  random.nextInt(end+1-start)+start; 멍청한 기법
			int guess = (end-start)/2;
			System.out.println(guess+"입니까? (1: 정답, 2: Up, 3: Down)");
			// input(up/down/정답) (1. 정답, 2.up, 3.down)
			Scanner sc = new Scanner(System.in);
			int answer = sc.nextInt();
			if(answer == 1) {
				//== -> "정답입니다.", break
				System.out.println("정답입니다.");
				break;
			}
			else if(answer == 2) {
				//up이면 guess+1 ~ end
				start = guess + 1;
				
			}
			else if(answer == 3) {
				//down이면 start ~ end -1
				end = guess-1;
			}
		}
	}

}