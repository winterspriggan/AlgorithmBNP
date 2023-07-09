import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String g = " ";
        String s = "*";
        String ss = "**";
        String[] out = new String[n];
        for(int i=0; i<n; i++) {
            out[i] = "";
            for(int j=n; j>i; j--) {
                if(j==i+1) break;
                out[i] += g;
            }
            for(int j=0; j<i+1; j++) {
                if(i==0) out[i] += s;
                else if(j==0) out[i] += s;
                else out[i] += ss;
            }
        }

        for(int i=0; i<n; i++) {
            System.out.println(out[i]);
        }
        for(int i=n-2; i>-1; i--) {
            System.out.println(out[i]);
        }
    }
}
