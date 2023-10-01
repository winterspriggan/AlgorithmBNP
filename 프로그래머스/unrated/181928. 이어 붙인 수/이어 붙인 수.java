class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int h = 0;
        int hC = 0;
        int z = 0;
        int zC = 0;
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 ==0) hC++;
            else zC++;
        }
        for(int i=0; i<num_list.length; i++) {
            if(num_list[i] % 2 ==0)   {
                h += num_list[i]*Math.pow(10, hC-1);
                hC--;
            }
            else {
                z += num_list[i]*Math.pow(10, zC-1);
                zC--;
            }
            
        }
        answer = z+h;
        return answer;
    }
}