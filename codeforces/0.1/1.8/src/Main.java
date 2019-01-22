import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int count =4;
        LinkedList<Integer> data = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            int x=input.nextInt();
            if(!data.contains(x)){
                data.add(x);
            count--;
            }
        }
        System.out.println(count);
    }
}
