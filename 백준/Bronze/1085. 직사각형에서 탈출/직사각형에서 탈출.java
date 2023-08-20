import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();
        int[] a = new int[4];
        a[0] = x;
        a[1] = y;
        if(w>x) a[2] = w-x;
        else a[2] = x-2;
        if(h>y) a[3] = h-y;
        else a[3] = y-h;
        int min = a[0];
        for(int i=1; i<4; i++) if(min>a[i]) min = a[i];
        System.out.print(min);
    }
}
