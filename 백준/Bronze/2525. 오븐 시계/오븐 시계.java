import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		int a = time/60;
		int b = time%60;
		int k=0;
		if(time>59) hour += a;
		if(min+b>59) {
			hour ++;
			min = min+b - 60;
		} else {
			min += b;	
		}
		if(hour>23) hour -=24;
		System.out.println(hour + " " + min);
		

	}
}
