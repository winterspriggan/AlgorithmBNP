import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String number =bf.readLine();
        int numb = Integer.parseInt(number);
        int count =0;
        for(int i=0; i<numb; i++) {
            String word = bf.readLine();
            ArrayList<Character> temp = new ArrayList<>();
            for(int j=0; j<word.length(); j++) {
                        temp.add(word.charAt(j));
            }
            boolean isGroup = true;
            for(int j=0; j<temp.size(); j++) {
                char t = temp.get(j);
                for(int k =temp.indexOf(t); k<temp.lastIndexOf(t); k++) {
                    if(!temp.get(k).equals(t)) isGroup =false;
                }
            }
            if(isGroup) {
                count ++;
            }
        }
        System.out.print(count);
    }
}
