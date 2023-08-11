import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int k = sc.nextInt();
        int t = 0;
        for(int i=0; i<k; i++) {
            int o = sc.nextInt();
            if(o==1) continue;
            int so = 0;
            for(int j=1; j<=o; j++) if(o%j==0) so++;
            if(so==2) t++;
        }
        System.out.println(t);
    }
}
