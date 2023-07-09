import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bfw = new BufferedWriter(new OutputStreamWriter(System.out));
        String i;
        StringTokenizer a;
        while((i = bfr.readLine()) != null)
        {
            a = new StringTokenizer(i);
            bfw.write(Integer.parseInt(a.nextToken()) + Integer.parseInt(a.nextToken())+"\n");
        }
        bfr.close();
        bfw.flush();
        bfw.close();
    }
}
