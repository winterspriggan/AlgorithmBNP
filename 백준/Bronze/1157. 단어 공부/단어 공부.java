import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String  s = bf.readLine().toUpperCase();
        char[] c = s.toCharArray();
        int[] alphaNum = new int[26];
        char[] alpha = new char[26];
        for(int i=0; i<26; i++) {
            alpha[i] = (char)(i+65);
        }
        for(int i=0; i<c.length; i++) {
            for(int j=0; j<26; j++) {
                if(c[i]==alpha[j]) alphaNum[j]++;
            }
        }
        int numb =0;
        int num = alphaNum[0];
        for(int i=0; i<26; i++) {
            if(num<alphaNum[i]) {
                numb = i;
                num = alphaNum[i];
            }
        }
        String k = ""+alphaNum[numb];
        for(int i=0; i<26; i++) {
            if(k.equals(""+alphaNum[i]) && numb!=i) {
                System.out.print("?");
                break;
            }
            else if(i == 25) {
                System.out.print(alpha[numb]);
                break;
            }
        }
    }
}
