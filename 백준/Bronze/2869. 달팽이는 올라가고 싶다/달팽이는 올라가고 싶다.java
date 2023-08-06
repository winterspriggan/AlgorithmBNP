import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String k = br.readLine();
        String[] list = k.split(" ");
        int A = Integer.parseInt(list[0]);
        int B = Integer.parseInt(list[1]);
        int V = Integer.parseInt(list[2]);
        int mok = V-A;
        int ans = 0;
        if(mok == 0) ans = 0;
        else if(mok<(A-B)) ans =1;
        else {
            if(mok%(A-B)==0) ans = mok/(A-B);
            else ans = mok/(A-B)+1;
        }
        System.out.print(ans+1);
    }
}
