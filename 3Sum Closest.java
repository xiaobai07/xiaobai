public class Solution {
    public int threeSumClosest(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int min=Integer.MAX_VALUE;
        int sum=0;
        if(num.length<3) return 0;        
        Arrays.sort(num);
        for(int i=0;i<num.length-2;i++){
            if(i==0 || num[i]>num[i-1]){ //avoid duplicate solutions   
                int j=i+1, k=num.length-1;
                while(j<k){ 
                    if(num[j]+num[k]+num[i]==target){
                        return target;

                    }else if(num[j]+num[k]+num[i]>target){
                                if((num[j]+num[k]+num[i]-target)<min) 
                                {
                                    min=num[j]+num[k]+num[i]-target;
                                    sum=num[j]+num[k]+num[i];                                        
                                }
                                k--; 
                                 
                    }else{
                           if(Math.abs(num[j]+num[k]+num[i]-target)<min)
                           {
                                 min=Math.abs(num[j]+num[k]+num[i]-target);
                                 sum=num[j]+num[k]+num[i];
                           }     
                           j++;
                    }
                }
            }
        }
        return sum;
    }
}
