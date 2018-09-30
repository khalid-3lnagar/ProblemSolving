import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int ShovelPrice, COIN, burleCoins = 10;
        Scanner input = new Scanner(System.in);
        ShovelPrice = input.nextInt();
        COIN = input.nextInt();


        int sumWithCoin = ShovelPrice;

        int sumWithoutCoin = ShovelPrice;
        int count = 1;

        while (true) {
            if ((sumWithCoin % burleCoins) == COIN || (sumWithCoin % burleCoins) == 0) {
                System.out.println(count);
                break;
            }
            sumWithCoin += ShovelPrice;
            sumWithoutCoin += ShovelPrice;
            count++;


        }


    }
}
