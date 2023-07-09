import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = Integer.parseInt(br.readLine());
        for (int i=0; i<size; i++) {
        String star = "";
            for (int k=0; k<i+1; k++) {
                star +="*";
            }
                System.out.printf("%"+size+"s %n",star);
        }

    }
}
