/*
This is an algorithm for solving the problem of checking if a given parenthese string is valid.
The code is commented for better understanding.
Refer to this link for attempting this problem: https://leetcode.com/problems/valid-parentheses/

--------------------------------
Author: Mudassar Raza(https://github.com/mraza1312)
Suggestions are most welcome.
--------------------------------
*/


#include<bits/stdc++.h>
using namespace std;

bool isValid(string str) {
    stack<char> s;
    s.push('0');
    
    for(int i=0;i<str.length();i++)
    {
        if(str[i]=='('|| str[i]=='['||str[i]=='{')
            s.push(str[i]);
        
        else
        {
            char c=s.top();
            s.pop();
            if( (str[i]==')' && c!='(') || (str[i]=='}' && c!='{') ||
                                            (str[i]==']' && c!='[') )
                return false;
        }
        
    }
    if(s.top() != '0') return false;
    
    return true;
}

int main() {
    string s; 
    cout<<"Enter a string for checking if it's a valid parentheses";
    cin>>s;
    bool isValidPar = isValid(s);
    if(isValidPar) cout<<"It's a valid Parentheses";
    else cout<<"It's not a valid Parentheses";
}
