public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function      
		ArrayList<Integer> cal = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> re = new ArrayList<ArrayList<Integer>>();
		int len = num.length;
		int[] used = new int[len];
		getpermute(num, used, len, cal, re);        
		return re;
    }

	  public void getpermute(int[] num, int[] used, int len, ArrayList<Integer> cal, ArrayList<ArrayList<Integer>> re){
    		if(cal.size() == len){
    			ArrayList<Integer> temp = new ArrayList<Integer>(cal);
    			re.add(temp);
    			return;
    		}

    		for(int i=0; i<len; i++){
    			if(used[i] == 0){
    				cal.add(num[i]);
    				used[i]=1;
    				getpermute(num,used,len,cal,re);
    				used[i]=0;
    				cal.remove(cal.size()-1);
    			}
		}
	}
}

public class Solution {
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        ArrayList<Integer> hs = new ArrayList<Integer>();
        HashSet<Integer> remain = new HashSet<Integer>();
        for(int i: num)
            remain.add(i);
        return perHelper(hs,remain);
    }
    public ArrayList<ArrayList<Integer>> perHelper(ArrayList<Integer> hs,HashSet<Integer> remain){
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(remain.size() == 0){
            ArrayList<ArrayList<Integer>> rs = new ArrayList<ArrayList<Integer>>();
            rs.add(hs);
            return rs;
            }
        else
            for(Integer in :remain){
                ArrayList<Integer> tempA = new ArrayList<Integer>(hs);
                tempA.add(in);
                HashSet<Integer> temp  = new HashSet<Integer>(remain);
                temp.remove(in);
                result.addAll(perHelper(tempA,temp));
            }
        return result;
    }
}

public class Permutations { public ArrayList<arraylist<integer>> permute(int[] num) {

    ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> a = new ArrayList<Integer>();
    a.add(num[0]);
    list.add(a);
    for(int i = 1; i < num.length; i++) {
        list = insert(list, num[i]);
    }
    return list;
}

public ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> list, int num) {
    ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
    for(int i = 0; i < list.size(); i++) {
        for (int j = 0; j < list.get(i).size() + 1; j++) {
            ArrayList<Integer> temp = new ArrayList<Integer>(list.get(i));
            temp.add(j, num);
            resultList.add(temp);
        }
    }
    return resultList;
}
