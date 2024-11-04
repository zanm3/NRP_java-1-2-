public class Vaja4 {
    public static void main(String[] args) {
        System.out.println(Multiply(2, -3));
    }

    public static int Multiply(int a, int b) {
        if (b == 0)
            return 0;
        if (a < 0)
            return a + Multiply(a, b - 1);
        if (b < 0)
            return -(Multiply(a, -b));
        else
            return a + Multiply(a, b - 1);
    }
}
