import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        String l1 = br.readLine();
        String l2 = br.readLine();
        String[] nu = l1.split(" ");
        int N = Integer.parseInt(nu[0]);
        int M = Integer.parseInt(nu[1]);
        String[] numbers = l2.split(" ");
        int[] cards = new int[N];
        for(int i=0; i<N; i++) {
            cards[i] = Integer.parseInt(numbers[i]);
        }
        int ans = 0;
        ArrayList<Integer> out = new ArrayList<>();
        ArrayList<Integer> minus = new ArrayList<>();
        for(int i=0; i<N-2; i++) {
            for(int j=i+1; j<N-1; j++) {
                for(int k=j+1; k<N; k++) {
                    ans = cards[i] + cards[j] + cards[k];
                    if(M-ans>=0) {
                        out.add(ans);
                        minus.add(M - ans);
                    }
                }
            }
        }
        int min = minus.get(0);
        int mm = 0;
        for(int i=1; i<minus.size(); i++) {
            if(min>=minus.get(i)) {
                min = minus.get(i);
                mm = i;
            }
        }
        System.out.print(out.get(mm));
    }
}
