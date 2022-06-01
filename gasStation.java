//https://leetcode.com/problems/gas-station/

// Time Complexity O(n), Space Complexity O(n)

//If at any cost, the total sum of fuel < total sum of cost, then answer is not possible.
//Now, traverse, using 0 as the starting index. Now, add gas[i]-cost[i] into a curr_fuel, for each iteration. 
//If the fuel is not enough, i.e, curr_fuel < 0, then we will make the starting index as i+1 and mark curr_fuel as 0.
//Return start at the end).

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int fuel_sum = 0;
        int cost_sum = 0;
        
        for(int i=0; i<gas.length; i++){
            fuel_sum += gas[i];
            cost_sum += cost[i];
        }
        
        if(fuel_sum < cost_sum){
            return -1;
        }
            int start = 0;
            int curr_fuel = 0;
            for(int i=0; i<gas.length; i++){
                curr_fuel += gas[i] - cost[i];
                if(curr_fuel < 0){
                    start = i+1;
                    curr_fuel = 0;
                }
            }
            return start;
   }  

}