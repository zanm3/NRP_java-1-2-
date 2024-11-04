import java.util.*;

public class Vaja1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Vnesi stevilo ponovitev");
        int loopNum = in.nextInt();
        int st = 0;
        do {
            if (loopNum <= 0) {
                break;
            } else {
                System.out.println("1. Pozdrav");
                System.out.println("2. Vizitka");
                System.out.println("3. Izhod");
                st = in.nextInt();
                switch (st) {
                    case 1:
                        System.out.println("Pozdravljen Pinko Palinko");
                        break;
                    case 2:
                        System.out.println("Pinko Palinko pinko.palinko@gmail.com");
                        break;

                    case 3:
                        break;
                }
                loopNum--;
            }
        } while (loopNum > 0);
    }
}