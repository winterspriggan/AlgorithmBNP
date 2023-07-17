import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws  IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        ArrayList<String> k = new ArrayList<>();

        while((input = br.readLine()) != null) {
            k.add(input);
        }
        for(int i=0; i<k.size(); i++) {
            System.out.println(k.get(i));
        }
        }
}