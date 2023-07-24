import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        double avg;
        double sum = 0;
        double hap = 0;
            Scanner sc = new Scanner(System.in);
        for(int i=0; i<20; i++) {
            String[] t = new String[3];
            t[0] = sc.next();
            t[1] = sc.next();
            t[2] = sc.next();
            if(!(t[2].equals("P"))) {
                hap += (gesan(t[2]) * Double.parseDouble(t[1]));
                sum += Double.parseDouble(t[1]);
            }

        }
        avg = hap/sum;
        if(sum != 0.0) {
            System.out.print(avg);
        } else {
            System.out.print(0.0000);
        }
        sc.close();
    }

    public static double gesan(String s) {
        double t;
        switch(s) {
            case "A+" : t = 4.5;
            break;
            case "A0" : t =4.0;
                break;
            case "B+" : t=3.5;
                break;
            case "B0" :  t=3.0;
                break;
            case "C+" : t=2.5;
                break;
            case "C0" : t=2.0;
                break;
            case "D+" : t =1.5;
                break;
            case "D0" : t=1.0;
                break;
            default : t= 0.0;
            break;
        }
        return t;
    }
}
