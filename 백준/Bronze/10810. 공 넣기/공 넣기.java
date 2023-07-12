import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String t = bf.readLine();
        String[] t2 = t.split(" ");
        int[] basket = new int[Integer.parseInt(t2[0])];
        String[] ball  = new String[Integer.parseInt(t2[1])];
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();

        for(int i=0; i<ball.length; i++) {
        ArrayList<Integer> temps = new ArrayList<>();
            ball[i] = bf.readLine();
            String[] te = new String[3];
            te = ball[i].split(" ");
            for(int j=0; j<3; j++) {
                temps.add(Integer.parseInt(te[j]));
            }
            temp.add(temps);
        }

        for(int i=0; i<ball.length; i++) {
            for(int j=temp.get(i).get(0)-1; j<temp.get(i).get(1); j++) {
                basket[j] = temp.get(i).get(2);
            }
        }
        for (int i=0; i<basket.length; i++) System.out.print(basket[i]+" ");
    }
}
