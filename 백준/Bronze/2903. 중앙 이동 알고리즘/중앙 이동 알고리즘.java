import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        int c = sc.nextInt();
        int o = 2;
        int t =1;
        for(int i=0; i<c-1; i++) {
            o+=t;
             t*=2;
        }
        o +=t;
        o *= o;
        System.out.print(o);
    }
}
