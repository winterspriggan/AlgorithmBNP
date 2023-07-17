import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] a = new char[26];
        int[] num = new int[a.length];
        for(int i=0; i<26; i++) {
            a[i] +=(char)(i+97);
            num[i] = -1;
        }
            for(int j=25; j>-1; j--) {
        for(int i=s.length()-1; i>-1; i--) {
                if(s.charAt(i) == a[j]) num[j] = i;
            }
        }
        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] +" ");
        }
    }
}
