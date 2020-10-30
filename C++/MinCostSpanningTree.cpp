#include <stdio.h>
#include <vector>
#include <algorithm>

using namespace std;

struct edge {
	int source, destination, weight;
};

bool customComparator(edge const& a, edge const& b){
	return a.weight < b.weight;
}

vector<edge> e(20), MST;
vector<int> parent(10), rank(10);

void make(int u){
	parent[u] = u;
	rank[u] = 0;
}

int find(int u) {
	if(u == parent[u])
		return u;

	return parent[u] = find(parent[u]);
}

void customUnion(int u, int v){

	u = find(u);
	v = find(v);

	if(u != v){
		if(rank[u] < rank[v])
			swap( u, v);
		
		parent[v] = u;

		if(rank[u] == rank[v])
			rank[u] = rank[u] + 1; 
	}
}

void addEdge(int i, int u, int v, int w){
	e[i].source = u;
	e[i].destination = v;
	e[i].weight = w; 
}

int main(){
	
	int V=10, E=20, minCost = 0, u, v, w;

	addEdge(0, 0, 1, 4);
	addEdge(1, 0, 7, 8);
	addEdge(2, 1, 2, 8);
	addEdge(3, 1, 7, 11);
	addEdge(4, 2, 3, 7);
	addEdge(5, 2, 8, 2);
	addEdge(6, 2, 5, 4);
	addEdge(7, 3, 4, 9);
	addEdge(8, 3, 5, 14);
	addEdge(9, 4, 5, 10);
	addEdge(10, 5, 6, 2);
	addEdge(11, 6, 7, 1);
	addEdge(12, 6, 8, 6);
	addEdge(13, 7, 8, 7);
	addEdge(14, 7, 9, 1);
	addEdge(15, 8, 9, 12);
	addEdge(16, 9, 6, 6);
	addEdge(17, 9, 1, 2);
	addEdge(18, 0, 4, 13);
	addEdge(19, 6, 3, 6);
	
	for(int i = 0; i < V; i++)
		make(i);

	sort(e.begin(), e.end(), customComparator);

	for(int i = 0; i < E; i++) {
 
		u = e[i].source;
		v = e[i].destination;
		w = e[i].weight;

		if (find(u) != find(v)){

			minCost += w;
			MST.push_back(e[i]);
			customUnion(u, v);
		}
	}

	printf("Minimum cost of the spanning tree: %d\n",minCost);
	for(unsigned int i = 0; i < MST.size(); i++ ) {
		printf("%d -> %d = %d\n",MST[i].source, MST[i].destination, MST[i].weight);
	}
	
	return 0;
}
