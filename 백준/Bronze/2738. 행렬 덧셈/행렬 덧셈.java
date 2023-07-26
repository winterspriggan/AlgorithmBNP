import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[][] matA = new int[a][b];
        int[][] matB = new int[a][b];
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++) matA[i][j] = sc.nextInt();
        }
        for(int i=0; i<a; i++) for(int j=0; j<b; j++) matB[i][j] = sc.nextInt();
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++) System.out.print(matA[i][j] + matB[i][j]+" ");
            System.out.println("");
        }
    }
}
