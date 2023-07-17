import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int tn = Integer.parseInt(bf.readLine());
        int[] k = new int[tn];
        String[] text = new String[tn];
        for(int n=0; n<tn; n++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
             k[n] = Integer.parseInt(st.nextToken());
             text[n] = st.nextToken();
        }
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<tn; i++) {
            for (int j = 0; j < text[i].length(); j++) {
                for(int t =0; t< k[i]; t++) {
                    bw.write(text[i].charAt(j));
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
