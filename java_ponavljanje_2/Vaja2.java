import java.util.*;

public class Vaja2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Vpisi stevilo ponovitev");
        int loopNum = in.nextInt();
        System.out.println("Vpisi prvo stevilo");
        int a = in.nextInt();
        System.out.println("Vpisi drugo stevilo");
        int b = in.nextInt();
        int operacija = 0;
        do{
            if(loopNum<=0){
                break;
            }else{
                System.out.println("1. Seštevanje");
                System.out.println("2. Odštevanje");
                System.out.println("3. Množenje");
                System.out.println("4. Deljenje");
                System.out.println("5. Izhod");
                System.out.println("Vpisi racunsko operacijo");
                    operacija = in.nextInt();
                switch (operacija) {
                    case 1:
                        System.out.println(a+b);
                        break;
                    
                    case 2:
                        System.out.println(a-b);
                        break;

                    case 3:
                        System.out.println(a*b);
                        break;

                    case 4:
                        System.out.println(Math.round(a/b));
                        break;

                    case 5:
                        break;
                }
            }
            loopNum--;
        }while(loopNum>0);
    }
}
