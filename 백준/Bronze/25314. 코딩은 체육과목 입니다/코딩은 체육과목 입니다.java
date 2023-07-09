import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		String a ="";
		if(input%4==0) {
			for(int i=0; i<input/4; i++) a +="long ";
		} else {
			for(int i=0; i<=input/4; i++) a +="long ";
		}
		System.out.println(a+"int");
	}
}