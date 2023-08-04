import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n==1) System.out.print("1");
        else {
            int numb =2;
            int bang =5;
            int count = 1;
            while(true) {
                if(n>=numb && n<=(numb+bang)) {
                System.out.println(++count);
                    break;
                } else {
                    numb += bang + 1;
                    bang += 6;
                    count++;
                }
            }
        }
    }
}