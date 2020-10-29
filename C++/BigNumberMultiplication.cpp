#include<bits/stdc++.h>
using namespace std;
int main()
{
        string a,b;
        cin >> a >> b;
        int lena=a.length();
        int lenb=b.length();
        int i,j;
        int max;
        if(lena>lenb)
                max=lena;
        else
                max=lenb;
        vector<int> c(max+1,0);
        for(i=0;i<lena;i++)
                for(j=0;j<lenb;j++)
                {
                        c[i+j]+=int(a[i]-'0')*int(b[j]-'0');
                }
//      for(i=0;i<lena+lenb-1;i++)
//              cout << c[i] << ' ';
//      cout << endl;
        for(i=lena+lenb-2;i>0;i--)
        {
                c[i-1]+=c[i]/10;
                c[i]=c[i]%10;
        }
        for(i=0;i<lena+lenb-1;i++)
                cout << c[i];
        cout << endl;
//      cout << "at 0 ="<<c[0] << " at 1 =" << c[1] << endl;
}
