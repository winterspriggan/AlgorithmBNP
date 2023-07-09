import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fac(sc.nextLong()));
	}
	public static long fac(long a) {
		if(a==1) return 1;
		if(a>1) return a*fac(a-1);
		else return 1;
	}

}