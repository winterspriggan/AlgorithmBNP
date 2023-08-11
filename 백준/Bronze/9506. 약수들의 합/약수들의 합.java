import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> ier = new ArrayList<>();
        ArrayList<Boolean> is = new ArrayList<>();
        while(true) {
        ArrayList<Integer> per = new ArrayList<>();
            int inp = sc.nextInt();
            if(inp == -1) break;
            for(int i=1; i<inp; i++) if(inp%i==0) per.add(i);
            int isPer= 0;
            for(int i=0; i<per.size(); i++) isPer += per.get(i);
                per.add(inp);
            if(isPer==inp) is.add(true);
            else is.add(false);
                ier.add(per);
        }
        for(int i=0; i<ier.size(); i++) {
            if(!is.get(i)) { System.out.println(ier.get(i).get(ier.get(i).size()-1)+" is NOT perfect.");}
            else {
                String so = ier.get(i).get(ier.get(i).size()-1)+" = ";
                for(int j=0; j<ier.get(i).size()-1; j++) {
                    if(j==ier.get(i).size()-2) so += ier.get(i).get(j)+"";
                    else so += ier.get(i).get(j)+" + ";
                }
                    System.out.println(so);
            }
        }
    }
}
