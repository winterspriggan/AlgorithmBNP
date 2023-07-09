import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<String> a = new ArrayList<String>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for(int i=0; i<k; i++) {
			String b = sc.next();
			if(b.length()>1) a.add(b.charAt(0)+""+b.charAt(b.length()-1));
			else 	a.add(b+b);
		}
		for(int i=0; i<k; i++) {
			System.out.println(a.get(i));
		}
	}
}