import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 public class Main {
     public static void main(String[] args) throws IOException {
         int mat[][] = new int[9][9];
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int max = 0;
         int a =0; int b = 0;
 for(int i=0; i<9; i++) {
             String[] input = br.readLine().split(" ");
             for(int j=0; j<9; j++) {
                 mat[i][j] = Integer.parseInt(input[j]);
 if(max <= mat[i][j]) {
max = mat[i][j];
 a =i+1;
 b =j+1;
                 }
             }
         }
         br.close();
         System.out.println(max);
         System.out.print( a+" " +b);
     }
 }