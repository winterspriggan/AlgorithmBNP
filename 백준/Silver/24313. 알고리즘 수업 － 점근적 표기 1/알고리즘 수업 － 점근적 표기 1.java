import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();int a0 = sc.nextInt();int c = sc.nextInt();int n0 = sc.nextInt();
        int n=0;
        boolean isT = true;
        for(int i=0; i<100; i++) {
            n++;
            if(n>n0) if((a1*n) + a0 > c*n) isT = false;
        }

        if(isT) System.out.print(1);
        else System.out.print(0);

    }
}
