import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String[] s = new String[a];
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			s[i] = b + " + " + c + " = " +(b+c);
		}
		for(int i=0; i<a; i++)System.out.println("Case #"+(i+1)+": "+s[i]);
	}
}