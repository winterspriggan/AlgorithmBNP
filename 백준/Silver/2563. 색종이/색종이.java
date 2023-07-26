import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
        int[][] paperWhite = new int[100][100];
        for(int i=0; i<number; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for(int j =x; j<x+10; j++) for(int k=y; k<y+10; k++) paperWhite[j][k] = 1;
        }
        int count =0;
        for(int i=0; i<100; i++) for(int j=0; j<100; j++) if(paperWhite[i][j]==1) count++;
        System.out.print(count);
    }

}