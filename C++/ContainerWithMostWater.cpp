/*
This is an algorithm for solving the standard DSA problem called "Container with most water"
Refer to this link for problem statement: https://leetcode.com/problems/container-with-most-water/

--------------------------------
Author: Mudassar Raza(https://github.com/mraza1312)
Suggestions are most welcome.
--------------------------------
*/

#include<bits/stdc++.h>
using namespace std;

int maxArea(int[] height) {
    int i = 0, j = height.length - 1;
    int water = 0;
    
    while(i<j){
        water = Math.max(water, (j-i)*Math.min(height[i], height[j]) );
        
        if(height[i] < height[j]) i++;
        else j--;
    }
    return water;
}

int main() {
    int n; 
    cin>>n;
    int a[n];
    for(int i=0; i<n; i++) {
        cin>>a[i];
    }

    int maximumArea = maxArea(a);
    cout<<maximumArea<<endl;
    return 0;
}
