import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int f = 665;
        int i=0;
        String a ="";
        while(true) {
            f++;
            a = ""+f;
            if(a.contains("666")) i++;
            if(i==k) break;
        }

        System.out.println(f);
    }
}
