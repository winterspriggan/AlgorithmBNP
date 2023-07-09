
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int p=0;
        for(int i=1; i<a+1; i++) {
            p += i;
        }
        System.out.print(p);
        
	}

}