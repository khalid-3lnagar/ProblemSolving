
import java.util.Scanner;

public class problem0 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fNum, f, h, fSum;
		fNum = input.nextInt();
		h = input.nextInt();
		
		fSum = 0;
		for (int i = 0; i < fNum; i++) {
		

				f = input.nextInt();
				if (f > h)
					fSum++;

				fSum++;

		}
		System.out.println(fSum);

	}

}
