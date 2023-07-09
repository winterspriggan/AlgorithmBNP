import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
                        int b = sc.nextInt();
		int a = sc.nextInt();

            		System.out.println((a%10)*b);
            		System.out.println(((a%100-a%10)/10)*b);
            		System.out.println((a/100)*b);
                        		System.out.println(a*b);




	}

}
