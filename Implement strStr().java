public class Solution {
    public String strStr(String haystack, String needle) {

if(haystack.isEmpty() ||needle.isEmpty())

{
    if(haystack.isEmpty() &&needle.isEmpty())
       return "";

   if(!haystack.isEmpty())
  {
     return haystack;
    }
   
   return null;
}


   if(haystack.length() < needle.length()) 
        return null;

    int[] next = new int[needle.length()];

     getNext(needle, next);

      int i = 0, j = 0;

while (i < haystack.length() && j < needle.length()) {
if (haystack.charAt(i) == needle.charAt(j)) {
if(j == needle.length() -1)
{
    return haystack.substring(i-j);
}

     ++i;
     ++j;

    } else {
   if(j == 0)
    i++;
     else
    j = next[j];
}
}
return null;
}


public void getNext(String T, int[] next)
{
   if(T.isEmpty() || T.length() ==1)
        return;

    int startPoint=0;
    next[1] = 0;
    int pos = 2;


while (pos < T.length())
{
if(T.charAt(pos - 1) == T.charAt(startPoint))
{
next[pos++] = ++startPoint;
}

else if(startPoint > 0)
{
startPoint = next[startPoint];
}

else
{
next[pos++] = 0;
}
}
}
}
