import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<28; i++) {
        numbers.add(sc.nextInt());
        }
        ArrayList<Integer> output = new ArrayList<>();
        for(int i=0; i<30; i++) {
            if(!numbers.contains(i+1)) output.add(i+1);
        }
        System.out.println(output.get(0));
        System.out.print(output.get(1));
    }
}
