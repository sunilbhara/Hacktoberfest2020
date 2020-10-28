#include <bits/stdc++.h>
using namespace std;

int main()
{
     int num;

    cout << "Enter a number: ";
    cin >> num;

     string s = to_string(num);
     string r = s;
     reverse(s.begin(),s.end());
     

    cout << " The reverse of the number is: " <<r << endl;

     if (s==r)
         cout << " The given number is a palindrome.";
     else
         cout << " The given number is not a palindrome.";

    return 0;
}
