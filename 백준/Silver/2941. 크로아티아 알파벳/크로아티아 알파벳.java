import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        int num = 0;
        int k =1;
            for(int i= s.length()-1; i>-1; i--) {
                num++;
                switch(s.charAt(i)) {
                    case '=' :
                        if(s.charAt(i-1) == 'c' ||s.charAt(i-1) == 's') i-=1;
                        else if(s.charAt(i-1) == 'z') {
                            if(i-1 == 0) {
                                i-=1;
                                break;
                            }
                            if(s.charAt(i-2) == 'd') i-=2;
                             else i-=1;
                        }
                        break;
                    case '-' :
                        i -=1;
                        break;
                    case 'j' :
                        if(i==0) break;
                        if(s.charAt(i-1) == 'n' ||s.charAt(i-1) == 'l') i -= 1;
                        break;
                    default :
                        break;
                }
            }
            System.out.print(num);
    }
}

