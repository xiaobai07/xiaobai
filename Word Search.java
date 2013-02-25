public class Solution {
    public boolean exist(char[][] board, String word) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(word.length()==0) return false;
        int m=board.length;
        int n=board[0].length;
        boolean[][] visit=new boolean[m][n];
        for (int k = 0; k < m; k++) {
            for (int r = 0; r < n; r++) {
                visit[k][r] = false;
            }
        }
        for(int i=0;i<m;i++)
           for(int j=0;j<n;j++)
           {
               if(board[i][j]==word.charAt(0)){
                   if(word.length()==1) return true;
                   else{
                       visit[i][j]=true;
                       if(searchword(board,word.substring(1),i,j,visit))
                       return true;
                       visit[i][j]=false;
                   }
               }
           }
        return false;
        
    }
    public boolean searchword(char[][] board,String word,int i,int j,boolean[][] visit)
    {
        if(word.length()==0) return true;
        else{
            if(((i-1)>=0)&&(!visit[i-1][j])&&board[i-1][j]==word.charAt(0)){
                    visit[i-1][j]=true;
                    if(searchword(board,word.substring(1),i-1,j,visit)) return true;
                    visit[i-1][j]=false;
                
            }
            
            if((i+1<board.length)&&!visit[i+1][j]&&board[i+1][j]==word.charAt(0)){
                    visit[i+1][j]=true;
                    if(searchword(board,word.substring(1),i+1,j,visit)) return true;
                    visit[i+1][j]=false;
                
            }
            
            if((j-1>=0) && !visit[i][j-1] && board[i][j-1]==word.charAt(0)){
                    visit[i][j-1]=true;
                    if(searchword(board,word.substring(1),i,j-1,visit)) return true;
                    visit[i][j-1]=false;
                
            }
           
            if((j+1<board[0].length)&&!visit[i][j+1]&&board[i][j+1]==word.charAt(0)){
                   visit[i][j+1]=true;
                   if(searchword(board,word.substring(1),i,j+1,visit)) return true;
                   visit[i][j+1]=false;
                
            }
          } 
          return false;
        
    }
}
