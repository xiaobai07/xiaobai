import java.util.*;
public class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Character> num1=new ArrayList<Character>(); 
        ArrayList<Character> num2=new ArrayList<Character>(); 
        int n=board.length;
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
           {
               if(board[i][j]=='.');
               else if(board[i][j]<'1'||board[i][j]>'9') return false;
                    else if(!num1.contains(board[i][j])) num1.add(board[i][j]);
                         else return false;
               if(board[j][i]=='.');
               else if(board[j][i]<'1'||board[j][i]>'9') return false;
                    else if(!num2.contains(board[j][i])) num2.add(board[j][i]);
                         else return false;  
                            
           }
           num1.clear();
           num2.clear();
        }
        for(int i=0;i<n;i+=3)
        {
           for(int j=0;j<n;j+=3)
           {
               for(int x=0;x<3;x++)
               {
                   for(int y=0;y<3;y++)
                   {
                       if(board[i+x][j+y]=='.');
                       else if(board[i+x][j+y]<'1'||board[i+x][j+y]>'9') return false;
                            else if(!num1.contains(board[i+x][j+y])) num1.add(board[i+x][j+y]);
                                 else return false;
                   }
               }
               num1.clear();
           }
        }
        return true;
    }
}
