import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String first, second;
        int firstSum = 0, secondSum = 0;
        first = input.next();
        second = input.next();


        for (int i = 0; i < first.length(); i++) {
            if (first.codePointAt(i) < 96)
                firstSum += first.codePointAt(i) + 32;
            else firstSum += first.codePointAt(i);

            if (second.codePointAt(i) < 96)
                secondSum += second.codePointAt(i) + 32;
            else secondSum += second.codePointAt(i);

            if (firstSum < secondSum) {
                System.out.println("-1");
                break;
            } else if (firstSum > secondSum) {
                System.out.println("1");
                break;
            }
        }
        if (firstSum == secondSum)
            System.out.println("0");
    }
}
