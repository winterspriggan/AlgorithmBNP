import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String k[] = new String[6];
        for(int i = 0; i<6; i++) {
            k[i] = sc.next();
        }
      int[] d = new int[6];
      for(int i=0; i<6; i++) {
          d[i] = Integer.parseInt(k[i]);
      }
        System.out.println((1-d[0]) +" " + (1-d[1]) + " " +(2-d[2]) + " " + (2-d[3]) + " " + (2-d[4]) + " " + (8-d[5]));
    }
}