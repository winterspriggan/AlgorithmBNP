class Solution {
    public int solution(String t, String p) {
     int leng = p.length();
        long[] tt = new long[t.length() - (leng) + 1];
        for(int i=0; i<tt.length; i++) {
            long k = 0;
            long z =(long)Math.pow(10 , leng-1);
            for(int j=i; j<i+p.length(); j++) {
                k += (t.charAt(j)-48) *z;
                z/=10;
            }
            tt[i] = k;
        }


        int answer = 0;
        for(int i=0; i<tt.length; i++) {
            if(Long.parseLong(p)>=tt[i]) 
                answer++;
            
        }
        return answer;
    }
}