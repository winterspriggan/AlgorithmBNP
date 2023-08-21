import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        ArrayList<String> o = new ArrayList<>();
        while(true) {
            input = br.readLine().trim();
            if(input.equals("0 0 0")) break;
            String[] g = input.split(" ");
            int a = Integer.parseInt(g[0]);
            int b = Integer.parseInt(g[1]);
            int c = Integer.parseInt(g[2]);
            if(a ==b && b ==c) o.add("Equilateral");
            else if(a+b<=c || a+c<=b || b+c<=a) o.add("Invalid");
            else if(a==b || a==c || b==c) o.add("Isosceles");
            else o.add("Scalene");
        }
        for(int i=0; i<o.size(); i++) System.out.println(o.get(i));
    }
}
