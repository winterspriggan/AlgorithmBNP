import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        String k = sc.next();
        int sum=0;
        for(int i=0; i<t; i++) {
            sum += (int)k.charAt(i)-48;
        }
        System.out.println(sum);
    }
}
