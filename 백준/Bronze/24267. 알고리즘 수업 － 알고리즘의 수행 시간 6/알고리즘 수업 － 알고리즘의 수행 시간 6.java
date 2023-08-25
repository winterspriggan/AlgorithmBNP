import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print((n-2)*(n-1)*(n)/6+"\n"+3);
    }
}
