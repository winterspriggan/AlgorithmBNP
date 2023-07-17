import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String str = new BufferedReader(new InputStreamReader(System.in)).readLine();
        boolean t = true;
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                t = false;
                break;
            }
        }
        if(t)
        System.out.println(1);
        else System.out.println(0);
    }
}
