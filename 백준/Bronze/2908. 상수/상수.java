import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(switcher(a) > switcher(b)) System.out.println(switcher(a));
        else System.out.println(switcher(b));
    }
    public static int switcher(int i) {
        int one = i/100;
        int two = (i/10) - (one)*10;
        int three = i - (one)*100 - (two)*10;
        return three*100 + two*10 + one;
    }
}
