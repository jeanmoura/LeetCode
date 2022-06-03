//https://leetcode.com/problems/finding-the-users-active-minutes/submissions/

//1817. Finding the Users Active Minutes

//Time Complexity O(n), Space Complexity o(n).


public class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        //Initializing hashmap with a HashSet
        Map<Integer, HashSet<Integer>> map = new HashMap<>();
        for(int [] log : logs){
           map.putIfAbsent(log[0], new HashSet());
           map.get(log[0]).add(log[1]);
        }

        int [] res = new int[k];
        for(int key : map.keySet()){
            res[map.get(key).size()-1]++;
        }
        return res;
    }
}