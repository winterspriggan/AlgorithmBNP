import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0; i<n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int maxX = x[0];
        int maxY = y[0];
        int minX = x[0];
        int minY = y[0];

        for(int i=1; i<n; i++) {
            if(maxX<x[i]) maxX = x[i];
            if(maxY<y[i]) maxY = y[i];
            if(minX>x[i]) minX = x[i];
            if(minY>y[i]) minY = y[i];
        }
        System.out.print((maxX - minX)*(maxY - minY));
    }
}
