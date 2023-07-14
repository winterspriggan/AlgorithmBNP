import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int nOfCase = Integer.parseInt(bf.readLine());
        String[] points = bf.readLine().split(" ");
        double temp = Integer.parseInt(points[0]);
        for(int i=0; i<nOfCase; i++) {
            if(temp < Double.parseDouble(points[i])) temp =  Double.parseDouble(points[i]);
        }
        double sum = 0;
        for(int i=0; i<nOfCase; i++) {
            points[i] = ""+ ( Double.parseDouble(points[i])/temp) *100;
            sum +=  Double.parseDouble(points[i]);
        }
        System.out.println(sum/nOfCase);

    }
}