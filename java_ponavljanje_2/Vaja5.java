import java.util.*;

public class Vaja5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("vnesi deljenec");
        int deljenec = in.nextInt();
        System.out.println("Vnesi deljitelj");
        int deljitelj = in.nextInt();
        in.close();

        System.out.println(Div(deljenec, deljitelj));
    }
    public static int Div(int deljenec, int deljitelj){
        if(deljenec<deljitelj){
            return 0;
        }else{
            return Div(deljenec-deljitelj, deljitelj) + 1;
        }
    }
}