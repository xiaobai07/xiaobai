public class Solution {
    public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num.length<4) return res;       
        Arrays.sort(num);
        for(int t=0;t<num.length-3;t++)
        {
          if(t==0||num[t]>num[t-1])
          {
              for(int i=t+1;i<num.length-2;i++)
              {
                 if(i==t+1 || num[i]>num[i-1])
                 { //avoid duplicate solutions   
                     int j=i+1,k=num.length-1;         
                     while(j<k)
                     { 
                            if(num[j]+num[k]+num[i]+num[t]==target){
                                ArrayList<Integer> temp = new ArrayList<Integer>();
                                temp.add(num[t]);
                                temp.add(num[i]);
                                temp.add(num[j]);
                                temp.add(num[k]);
                                if(!res.contains(temp))
                                    res.add(temp);
                                k--;
                                j++;
                                while(j<k && num[k]==num[k+1]) k--;//avoid duplicate solutions 
                                while(j<k && num[j]==num[j-1]) j++;//avoid duplicate solutions 
        
                            }else if(num[j]+num[k]+num[i]+num[t]>target){
                                k--;
                            }else{
                                j++;
                            }
                    }
                 } 
              }
          }
            
        }    
        return res;
    }
}
