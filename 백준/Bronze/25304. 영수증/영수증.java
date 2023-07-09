import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay = sc.nextInt();
		int count = sc.nextInt();
		int realPay = 0;
		for(int i=0; i<count; i++) {
			int what = sc.nextInt();
			int how = sc.nextInt();
			realPay += what*how;
		}
		if(realPay==pay) {
			System.out.println("Yes");
		} else {
		System.out.println("No");
		}
	}
}
