import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int za = 1;
        int gp = 1;
        int mo = 1;
        int count=1;
        Loop1: while (true) {
            if(gp%2==0) {
            za=1;
            mo=gp;
                for (int j = 1; j <= gp; j++) {
                    if (count == input) break Loop1;
                    za++;
                    mo--;
                    count++;
                }
            } else {
                mo=1;
                za=gp;
                for (int j = 1; j <= gp; j++) {
                    if (count == input) break Loop1;
                    za--;
                    mo++;
                    count++;
                }
            }
            gp++;
        }
        System.out.print(za + "/" + mo);
    }
}
