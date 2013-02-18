public class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        if(num.length<3) return res;       
        Arrays.sort(num);
        for(int i=0;i<num.length-2;i++){
            if(i==0 || num[i]>num[i-1]){ //avoid duplicate solutions   
                int j=i+1,k=num.length-1;        
                while(j<k){ 
                    if(num[j]+num[k]+num[i]==0){
                        ArrayList<Integer> temp = new ArrayList<Integer>();
                        temp.add(num[i]);
                        temp.add(num[j]);
                        temp.add(num[k]);
                        if(!res.contains(temp))
                             res.add(temp);
                        k--;
                        j++;
                        while(k>j && num[k]==num[k+1]) k--;//avoid duplicate solutions 
                        while(j<k && num[j]==num[j-1]) j++;//avoid duplicate solutions 

                    }else if(num[j]+num[k]>-num[i]){
                        k--;
                    }else{
                        j++;
                    }
                }
            }
        }
        return res;
    }
}
