import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> cards = new LinkedList<>();
        int n = in.nextInt();
        int ser = 0, dim = 0;
        for (int i = 0; i < n; i++) {
            cards.add(in.nextInt());
        }
        for (int i = 0; i < n; i++) {
            if (cards.isEmpty()) break;
            //sereja turn
            if (cards.getFirst() > cards.getLast()) {
                ser += cards.getFirst();
                cards.removeFirst();
            } else {
                ser += cards.getLast();
                cards.removeLast();
            }
            if (cards.isEmpty()) break;

            //dima turn
            if (cards.getFirst() > cards.getLast()) {
                dim += cards.getFirst();
                cards.removeFirst();
            } else {
                dim += cards.getLast();
                cards.removeLast();
            }

        }

        System.out.println(ser + " " + dim);

    }
}
