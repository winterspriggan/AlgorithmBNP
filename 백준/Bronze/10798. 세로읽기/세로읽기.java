import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] te = new char[5][];
        for(int i=0; i<5; i++) {
         char[] t =  br.readLine().toCharArray();
         te[i] = t;
        }
        for(int j=0; j<15; j++) for (int i = 0; i < 5; i++) if(j<te[i].length)System.out.print(te[i][j]);
        }
    }
