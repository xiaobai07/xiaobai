public class Solution {
    public int maxArea(int[] height) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int maxarea=0;
        int i=0,j=height.length-1;
        while(i<j){
            int area=Math.min(height[i],height[j])*(j-i);
            if(maxarea<area) maxarea=area;
            if(height[i]<height[j]) i++;
            else j--;
        }
        return maxarea;
        
    }
}
