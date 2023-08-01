import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(br.readLine());
        String[] output = new String[numb];
        for(int i=0; i<numb; i++) {
            int kase = Integer.parseInt(br.readLine());
            int quarter = kase/25;
            kase =kase%25;
            int dime = kase/10;
            kase = kase%10;
            int nikel = kase/5;
            kase = kase%5;
            int penny = kase/1;
            output[i] = quarter+" "+dime+" "+nikel+" "+penny;
        }
        for(int i=0; i<numb; i++) {
            System.out.println(output[i]);
        }
    }
}
