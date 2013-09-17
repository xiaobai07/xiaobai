public class Solution {
    public ArrayList<String> letterCombinations(String digits) {
    HashMap<Character,String> map = new HashMap<Character,String>();
    map.put('2',"abc");
    map.put('3',"def");
    map.put('4',"ghi");
    map.put('5',"jkl");
    map.put('6',"mno");
    map.put('7',"pqrs");
    map.put('8',"tuv");
    map.put('9',"wxyz");
	ArrayList<String> ret = new ArrayList<String>();
	StringBuilder sb = new StringBuilder();
	letterCombinations(digits, 0, sb, ret,map);
	return ret;
    }

    private void letterCombinations(String digits, int i, StringBuilder sb, ArrayList<String> ret,HashMap<Character,String> map) {
	if (i >= digits.length()) {
	    ret.add(sb.toString());
	} else {

	    String part = map.get(digits.charAt(i));
	    for (int j = 0; j < part.length(); j++) {
		sb.append(part.charAt(j));
		letterCombinations(digits, i + 1, sb, ret,map);
		sb.deleteCharAt(sb.length() - 1);
	    }
	}
    }
}
