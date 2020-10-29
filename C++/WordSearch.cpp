/*
This is an algorithm for solving the problem of finding if a given word exists in a 2D grid of characters.
The code is commented for better understanding.
Refer to this link for attempting this problem:  https://leetcode.com/problems/word-search/

--------------------------------
Author: Mudassar Raza(https://github.com/mraza1312)
Suggestions are most welcome.
--------------------------------
*/



#include<bits/stdc++.h>
using namespace std;

int row, col ;
string s;
bool exist(vector<vector<char>>& board, string word) {
    row = board.size(); 
    col = board[0].size();
    s=word;
    
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(board[i][j] == s[0] && search(board,0,i,j) == true ) 
                return true;
        }
    }
    return false;
}

bool search(vector<vector<char>>& board, int index, int i, int j){
    
    if(index == s.size() ) return true;
    
    if(i>=row || j>=col || i<0 || j<0 || s[index] != board[i][j] ) 
        return false;
    
    char c = s[index];
    board[i][j] = '#' ;     // these 2 steps avoid the need of visited boolean matrix
    
    if( search(board, index+1, i+1, j) ||
        search(board, index+1, i-1, j) ||
        search(board, index+1, i, j+1) ||
        search(board, index+1, i, j-1) )
    {
        return true;
    }
    
    // restore the selected letter
    board[i][j] = c;
    return false;
}

int main() {
    /*
    make suitable input like this
    board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
    */

    // call the exist function to find if the word exists;
    // bool doesExist = exist(board, word);

    return 0;
}
