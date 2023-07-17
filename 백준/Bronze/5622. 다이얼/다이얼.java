import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        a.add("ABC");
        a.add("DEF");
        a.add("GHI");
        a.add("JKL");
        a.add("MNO");
        a.add("PQRS");
        a.add("TUV");
        a.add("WXYZ");
        String te = sc.next();
        int[] num = new int[te.length()];
        for(int i=0; i<a.size(); i++) {
            for(int j=0; j<a.get(i).length(); j++) {
                for(int k=0; k<te.length(); k++) {
                    if (te.charAt(k) == a.get(i).charAt(j)) num[k] += i+3;
                }
            }
        }
        int sum =0;
        for(int i=0; i<num.length; i++) {
            sum += num[i];
        }
        System.out.println(sum);
    }
}
