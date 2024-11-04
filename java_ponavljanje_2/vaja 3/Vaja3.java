import java.io.*;

public class Vaja3 {
    public static void main(String[] args) {
        System.out.println(vBinary());
        toBin();
    }
    // prva rešitev
    public static void toBin(){
        try{
            FileInputStream fs = new FileInputStream("vaja3.txt");
            int c;
            String bin = ""; 
            while(fs.available()!=0){
                c = fs.read();
                bin = bin + Integer.toBinaryString(c);
            }
            System.out.println(bin);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    // druga rešitev
    public static String vBinary() {
        String s;
        String bin = "";
        char[] arr;
        int val = 0;
        try {
            BufferedReader input = new BufferedReader(new FileReader("vaja3.txt"));
            while (input.ready()) {
                s = input.readLine();
                arr = s.toCharArray();
                for (int i = 0; i < arr.length; i++) {
                    bin = bin + String.format("%8s", Integer.toBinaryString(arr[i])).replaceAll(" ", "0");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bin;
    }
}
