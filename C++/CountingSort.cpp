#include<bits/stdc++.h>
using namespace std;
int main()
{
        int n;
        vector<int> count(1000000,0);
        cin >> n;
        int arr[n];
        int i;
        for(i=0;i<n;i++)
                cin >> arr[i];
        for(i=0;i<n;i++)
                count[arr[i]]++;
        int c=0;
        for(i=0;i<1000000;i++)
        {
                if(count[i]!=0)
                        while(count[i]--)
                                cout << i << ' ';
        //      count[i]+=c;
        //      c=count[i];
        }
        cout << endl;
//      for(i=0;i<100;i++)
//              cout << count[i] << ' ';
//      cout << endl;
//      for(i=0;i<1000000;i++)
}

