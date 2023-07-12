import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(bf.readLine());
        ArrayList<Integer> numbs = new ArrayList<>();
        String numbers = bf.readLine();
        String[] numberss = numbers.split(" ");
        for(int i=0; i<numb; i++) {
            numbs.add(Integer.parseInt(numberss[i]));
        }
        int min= numbs.get(0);
        int max = numbs.get(0);
        for(int i=0; i<numbs.size(); i++) {
            if(min > numbs.get(i)) min = numbs.get(i);
            if(max < numbs.get(i)) max = numbs.get(i);
        }
        System.out.println(min +" " + max);
    }
}
