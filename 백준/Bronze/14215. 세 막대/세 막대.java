import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] t = new int[3];
        for(int i=0; i<3; i++) t[i] = sc.nextInt();
        if(t[0] >= t[1] && t[0] >= t[2]) {
            if(t[0] >= t[1]+t[2]) t[0] = t[1]+t[2]-1;
        } else if(t[1] >= t[2] && t[1] >= t[0]) {
            if(t[1] >= t[0]+t[2]) t[1] = t[0]+t[2]-1;
        } else if(t[2] >= t[1] && t[2] >= t[0]) {
            if(t[2] >= t[0]+t[1]) t[2] = t[0]+t[1]-1;
        }
        System.out.print(t[0]+t[1]+t[2]);
    }
}
