import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        int in =Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        ArrayList<Integer> so = new ArrayList<>();
        Loop1 : while(true) {
            if(in==1) break;
            if(in%2 ==0) {
                so.add(2);
                if (in / 2 == 1) break Loop1;
                in /=2;
            } else {
                int k =3;
                for (int i = k; i <= in; i++) {
                    if (in % i == 0) {
                        so.add(i);
                        if (in / i == 1) break Loop1;
                        in /= i;
                        break;
                    }
                k++;
                }
            }
        }
        if(so.size()!=0)
            for (int i = 0; i < so.size(); i++) System.out.println(so.get(i));
    }
}
