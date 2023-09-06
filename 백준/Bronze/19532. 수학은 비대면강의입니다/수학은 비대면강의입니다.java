import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[6];
        for(int i=0; i<6; i ++) a[i] = sc.nextInt();
        int x = -999; int y = -999;
       Loop1: for(int i=-999; i<1000; i++) {
            x = -999;
            for(int j=-999; j<1000; j++) {
                if ((a[0] * x) + (a[1] * y) == a[2]) if ((a[3] * x) + (a[4] * y) == a[5]) break Loop1;
                x++;
            }
            y++;
        }
        System.out.println(x+" "+y);
    }
}
