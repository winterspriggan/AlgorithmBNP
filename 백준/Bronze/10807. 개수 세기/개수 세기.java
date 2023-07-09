import java.util.Scanner;
class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] k = new int[a];
		for(int i=0; i<a; i++) k[i] = sc.nextInt();
		int c = sc.nextInt();
		int p = 0;
		for(int i=0; i<a; i++) {
			if(k[i]==c) p++;
		}
		System.out.println(p);
	}
}