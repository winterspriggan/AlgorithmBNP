import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] numbs = new int[9];
        for(int i=0; i<9; i++) {
            numbs[i]= Integer.parseInt(bf.readLine());
        }
        int max = numbs[0];
        int numb = 1;
        for(int i=0; i<9; i++) {
            if(max < numbs[i]) {
                max = numbs[i];
                numb = i+1;
            }
        }
        
        System.out.println(max);
        System.out.print(numb);
        
    }
}