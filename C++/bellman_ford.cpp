#include<bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
 
using namespace std;
using namespace __gnu_pbds;
 
#define endl "\n"
#define pu push_back           
#define pp pop_back
#define all(v) v.begin(),v.end()
#define rall(v) v.rbegin(),v.rend()
#define IOS() ios::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
const long long MOD=1e9+7;
const long double PI = acos(-1);
const long long INF=INT_MAX;
const long long LINF=LLONG_MAX;
 
typedef long long ll;
typedef long double ld;

int E=0;
unordered_map<int,pair<int,pair<int,int> > >  l;
void addEdge(int index,int x,int y,int wt)
{
	l[index]=(make_pair(x,make_pair(y,wt)));
	E++;
}
void Path(int V, int src) 
{ 
	vector<int> dist(V, INF);
	dist[src] = 0; 
	for(int i=1;i<=V-1;i++)
	{
		for(int j=0;j<E;j++)
		{
			pair<int,pair<int,int> >nbrs=l[j];
				int u=nbrs.first;
				int v=nbrs.second.first;
				int w=nbrs.second.second;
				if (dist[u] != INF && dist[u] + w < dist[v]) 
                dist[v] = dist[u] + w; 
		}
	} 
	for(int j=0;j<E;j++)
		{
    pair<int,pair<int,int> > nbrs=l[j];
				int u=nbrs.first;
				int v=nbrs.second.first;
				int w=nbrs.second.second;
				if (dist[u] != INF && dist[u] + w < dist[v]){
               printf("Graph contains negative weight cycle"); 
               return;
           
             } 
    } 
    
    printf("Vertex Distance from Source\n"); 
    for (int i = 0; i < V; ++i) 
        printf("%d \t\t %d\n", i, dist[i]); 
} 
int main()
{
    IOS();
   // #ifndef ONLINE_JUDGE
     //  freopen("input.txt", "r", stdin);
       // freopen("output.txt","w",stdout);
    // #endif  
    addEdge(0, 0, 1, -1);
    addEdge(1, 0, 2, 4);
    addEdge(2, 1, 2, 3);
    addEdge(3, 1, 3, 2);
    addEdge(4, 1, 4, 2);
    addEdge(5, 3, 2, 5);
    addEdge(6, 3, 1, 1);
    addEdge(7, 4, 3, -3);
        Path(5, 0); 
    
    return 0;
}