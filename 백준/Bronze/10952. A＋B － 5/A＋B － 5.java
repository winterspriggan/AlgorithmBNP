import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> n = new ArrayList<>();
        while(true) {
            n.add(br.readLine());
            if(n.get(n.size()-1).equals("0 0")) {
                break;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<n.size()-1; i++) {
            StringTokenizer st = new StringTokenizer(n.get(i));
            bw.write(Integer.parseInt(st.nextToken())+ Integer.parseInt(st.nextToken()) +"\n");
        }
        bw.flush();
        bw.close();
    }
}