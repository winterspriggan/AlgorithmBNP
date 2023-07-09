import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(bf.readLine());
        String testCase[] = new String[numb];
        for(int i=0; i<testCase.length; i++) {
            testCase[i] = bf.readLine();
        }
        BufferedWriter bw = new BufferedWriter((new OutputStreamWriter(System.out)));
        for(int i=0; i<testCase.length; i++) {

            StringTokenizer st = new StringTokenizer(testCase[i]);
            int ans =  Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write(ans+"\n");
        }
            bw.flush();
            bw.close();

    }
}