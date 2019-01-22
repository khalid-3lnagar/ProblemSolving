import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        if (isReasonable()) System.out.println("YES");
        else System.out.println("NO");
    }

    private static boolean isReasonable() {


        boolean reas = false;

        Scanner in = new Scanner(System.in);
        int need = in.nextInt(),
                time = in.nextInt(),
                cakes = in.nextInt(),
                newOven = in.nextInt();
        //to get
        int count = (need + cakes - 1) / cakes;
        int o1 = 0, o2 = newOven;

        for (int i = 0; i < count; i++) {
            if (o1 <= o2) o1 += time;
            else o2 += time;

        }
        if (Math.max(o1, o2) < time * count) return true;
        return reas;

    }
}


