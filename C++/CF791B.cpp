#include<bits/stdc++.h>
using namespace std;
vector <vector <int>> g;
bool v[150002]={false};
long long int nodes,edges;

void dfs(int n)
{
    if(v[n]) return;
    v[n]=true;
    nodes++;
    edges+=g[n].size();
    for(auto &i:g[n])
    dfs(i);
}


int main()
{
    int n,m;
    cin>>n>>m;
    g.resize(n+1);
    for(int i=0;i<m;i++)
    {
        int a,b;
        cin>>a>>b;
        g[a].push_back(b);
        g[b].push_back(a);
    }
    for(int i=1;i<=n;i++)
    {
        if(!v[i])
        {
            dfs(i);
            if(nodes*(nodes-1)!=edges)
            {
                cout<<"NO";
                return 0;
            }
            nodes=edges=0;
        }
    }
    cout<<"YES";
}

