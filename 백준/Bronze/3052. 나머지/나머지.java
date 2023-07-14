import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> gar = new ArrayList<>();
        for(int i=0; i<10; i++) {
            gar.add(sc.nextInt()%42);
        }
        int num = 0;
        for(int i=0; i<gar.size(); i++) {
            for(int k=i+1; k<gar.size(); k++) {
               if(gar.get(i).equals(gar.get(k))) {
                   num +=1;
                   break;
               }
            }
        }
        System.out.print(10-num);
    }
}