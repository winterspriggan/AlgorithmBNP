import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>0&&b<45) System.out.print(a-1+" " +(60-(45-b)));
        else if(a==0&&b<45) System.out.print(23+" "+(60-(45-b)));
		else System.out.println(a+" " + (b-45));
	}

}