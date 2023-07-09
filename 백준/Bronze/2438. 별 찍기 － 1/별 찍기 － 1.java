import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		String b= "*";
		for(int i=0; i<a-1; i++) {
			System.out.println(b);
			b+="*";
		}
		System.out.println(b);
	}
}