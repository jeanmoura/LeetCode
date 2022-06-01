//https://leetcode.com/problems/jump-game-iii/


class Solution {
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        return dfs(arr, start, 0);
    }
    
    public boolean dfs(int[] arr, int start, int count){
        if(start < 0 || start >= arr.length) return false;
        if(arr[start] == 0)return true;
        if(count >= arr.length) return false;
        return (dfs(arr, start + arr[start], count + 1)) || (dfs(arr, start - arr[start], count + 1)) ;

    }
}

