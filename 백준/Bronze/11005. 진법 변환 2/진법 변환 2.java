import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ten = sc.nextInt();
        int jin = sc.nextInt();
        ArrayList<Integer> t = new ArrayList<>();
        while(ten>0) {
            t.add(ten%jin);
            ten/=jin;
        }
        for(int i=t.size()-1; i>=0; i--) {
            if(t.get(i)>9) System.out.print((char)(t.get(i)+55));
            else System.out.print(t.get(i));
        }
    }
}
