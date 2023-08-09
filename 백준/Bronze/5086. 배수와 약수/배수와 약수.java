import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> output = new ArrayList<>();
            Scanner sc = new Scanner(System.in);

        while(true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = 0;
            if(a == 0 && b == 0) break;
            if(b%a==0) output.add("factor");
            else if(a%b==0) output.add("multiple");
            else output.add("neither");
        }
        sc.close();
        for(int i=0; i<output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
