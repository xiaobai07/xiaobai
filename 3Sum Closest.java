public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int min=Integer.MAX_VALUE;
        int sum=0;
        if(num.length<3) return 0;        
        Arrays.sort(num);
        for(int i=0;i<num.length-2;i++)
        {
            if(i==0 || num[i]>num[i-1])
            { //avoid duplicate solutions   
                int j=i+1, k=num.length-1;
                while(j<k){ 
                    int tmpsum=num[j]+num[k]+num[i];
                    if(tmpsum==target){
                        return target;
                    }else if(tmpsum>target){
                                if((tmpsum-target)<min) 
                                {
                                    min=tmpsum-target;
                                    sum=tmpsum;                                        
                                }
                                k--; 
                                while(j<k&&num[k+1]==num[k]) k--;                                 
                    }else{
                           if(Math.abs(tmpsum-target)<min)
                           {
                                 min=Math.abs(tmpsum-target);
                                 sum=tmpsum;
                           }     
                           j++;
                           while(j<k&&num[j-1]==num[j]) j++;
                    }
                }
            }
        }
        return sum;
    }
}

//using binary search, O(n^2logn) time, O(1) space:
public int threeSumClosest(int[] num, int target) {
    if (num.length<3) { // if less than three items then return 0
        return Integer.MAX_VALUE;
    }
    Arrays.sort(num);
    int res = num[0]+num[1]+num[2];
    for (int i=0; i<num.length-2; ++i) {
        if (i>0 && num[i]==num[i-1])  continue;
        for (int j=i+1; j<num.length-1; ++j) {
            if (j>i+1 && num[j]==num[j-1])  continue;
            // binary search for the third
            int start=j+1, end=num.length-1;
            while (start<=end) {
                int mid = (start+end)/2;
                int curRes = num[i] + num[j] + num[mid];
                int diff = curRes - target;
                if ( Math.abs(diff) < Math.abs(res - target) ) {
                    res = curRes;
                }
                if (diff < 0) {
                    start = mid+1;
                } else {
                    end = mid-1;
                }
            }
        }
    }
    return res;
}
