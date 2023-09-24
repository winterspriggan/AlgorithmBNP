import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
       HashMap<String, Integer> m = new HashMap<>();
        for(int i=0; i<players.length; i++) m.put(players[i], i);
        String[] answer = {};
        for(int j=0; j<callings.length; j++) {
        int r = m.get(callings[j]);
        String temp = players[r-1];
        m.put(players[r-1], r);
        players[r-1] = players[r];
        players[r] = temp;
        m.put(players[r-1], r-1);
        }
        answer = players;
        return answer;
    }
}