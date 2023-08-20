import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] in = sc.next().toCharArray();
        long jin = sc.nextInt();
        long za = 0;
        long ten = 0;
        long im = 1;
        for(int i=in.length-1; i>=0; i--) {
            for(int j=0; j<za; j++) im*=jin;
            long temp =0;
            if(!(in[i]>='0' && in[i] <='9'))temp = (int)(in[i] -55);
            else temp = in[i]-48;
            ten += (temp*im);
            za++;
            im=1;
        }
System.out.println(ten);
    }
}
