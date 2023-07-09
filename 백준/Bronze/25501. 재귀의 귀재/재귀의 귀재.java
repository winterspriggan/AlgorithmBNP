import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int a=1;

	    public static int recursion(String s, int l, int r){
	        if(l >= r) return 1;
	        else if(s.charAt(l) != s.charAt(r)) return 0;
	        else {
	        	a +=1;
	        	return recursion(s, l+1, r-1);
	        }
	    }
	    public static int isPalindrome(String s){
	        return recursion(s, 0, s.length()-1);
	    }
	    public static void main(String[] args){
	    	Scanner sc = new Scanner(System.in);
	    	int q =sc.nextInt();
	    	ArrayList<String> save = new ArrayList<String>(q);
	    	for(int i =0; i<q; i++) {
	    		String w = sc.next();
	    		save.add(isPalindrome(w)+" " +a);
	    		a=1;
	    	}
	    	for(int i=0; i<save.size(); i++) {
	    	System.out.println(save.get(i));
	    	}
	    }
	}
