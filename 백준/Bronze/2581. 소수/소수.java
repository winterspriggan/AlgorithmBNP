import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=a; i<b+1; i++) {
            int k=0;
            for(int j=1; j<=i; j++) if(i%j==0) k++;
            if(k==2) arr.add(i);
        }
        int min =0;
        if(arr.size()!=0) min = arr.get(0);
        for(int i=0; i<arr.size(); i++) {
            if(min>arr.get(i)) min = arr.get(i);
            sum += arr.get(i);
        }
        if(arr.size()!=0) System.out.print(sum+"\n"+min);
        else System.out.println(-1);
    }
}
