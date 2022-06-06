//https://leetcode.com/problems/jewels-and-stones/

class Solution {
    public int numJewelsInStones(String J, String S) {
        if(J == null || J.isEmpty() || S == null || S.isEmpty()) return 0;
        
        Set<Character> dict = new HashSet<Character>();
        for(int i = 0; i < J.length(); i++){
            dict.add(J.charAt(i));
        }
        
        int count = 0;
        for(int i = 0; i < S.length(); i++){
            if(dict.contains(S.charAt(i))){
                count++;
            }
        }
        
        return count;
    }
}