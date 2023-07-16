import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] temp1 = bf.readLine().split(" ");
        int[] basket =new int[Integer.parseInt(temp1[0])];
        int path = Integer.parseInt(temp1[1]);
        for(int i=0; i< basket.length; i++) {
            basket[i] = i+1;
        }
        for(int i=0; i< path; i++) {
            String[] dummy = bf.readLine().split(" ");
            int start = Integer.parseInt(dummy[0]);
            int end = Integer.parseInt(dummy[1]);

            basket = switcher(start, end, basket);
        }
        for(int i=0; i< basket.length;i++) {
            System.out.print(basket[i]+" ");
        }
    }
    public static int[] switcher(int start, int end, int[] basket) {
        if(start == end) return basket;
            int center = (end+start)/2;
            int dummy = 0;
            int num = 0;
            for(int i=start-1; i<center; i++) {
                dummy = basket[i];
                basket[i] = basket[end-1-num];
                basket[end-1-num] = dummy;
                num++;
            }
        return basket;
    }
}
