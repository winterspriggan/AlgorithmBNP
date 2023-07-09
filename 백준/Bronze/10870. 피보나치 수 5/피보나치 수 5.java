import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(p(sc.nextInt()));
	}
	public static int p(int i) {
		if(i==0) return 0;
		if(i==1) return 1;
		if(i==2) return 1;
		return p(i-1)+p(i-2);
	}
}