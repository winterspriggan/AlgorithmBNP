import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        ArrayList<Integer> c = new ArrayList<>();
        int d =0;
        for(int i=1; i<=a; i++) {
            if(a%i==0) c.add(i);
        }
        if(c.size()>=b)System.out.print(c.get(b-1));

        else System.out.print(0);
    }
}
