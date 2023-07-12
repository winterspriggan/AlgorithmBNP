import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] numbs = bf.readLine().split(" ");
        int[] numb = new int[numbs.length];
        for(int i=0; i<numb.length; i++) {
            numb[i] = Integer.parseInt(numbs[i]);
        }
        String[] tem = new String[numb[1]];
        for(int i=0; i<tem.length; i++) {
            tem[i] = bf.readLine();
        }
        int[] basket  = new int[numb[0]];
        for(int i=0;i<basket.length; i++) {
            basket[i] = i+1;
        }

        for(int i=0; i<tem.length; i++) {
            String[] numbers = tem[i].split(" ");
            int ch1 = Integer.parseInt(numbers[0]);
            int ch2 = Integer.parseInt(numbers[1]);
            int temp = basket[ch1-1];
                basket[ch1-1] = basket[ch2-1];
                basket[ch2-1] = temp;
        }
        for(int i=0; i<basket.length; i++) {
            System.out.print(basket[i]+" ");
        }
    }
}
