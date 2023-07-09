import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] k = br.readLine().split(" ");
        int N = Integer.parseInt(k[0]);
        int X = Integer.parseInt(k[1]);
        String A = br.readLine();
        String[] A1 = A.split(" ");
        for(int i=0; i<N; i++) {
            if(Integer.parseInt(A1[i])<X) {
                bw.write(A1[i]+" ");
            }
        }
        bw.flush();
        bw.close();
    }
}
