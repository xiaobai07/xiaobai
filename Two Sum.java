import java.util.*;
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int[] index=new int[2];
        index[0]=0;index[1]=0;
        for(int i=0;i<numbers.length;i++)
        {
            if(!map.containsKey(numbers[i]))
            {
                map.put(target-numbers[i],i);
            }
            else{
                index[0]=map.get(numbers[i])+1;
                index[1]=i+1;
                return index;
            }
        }
        return index;
    }
}
