#include <iostream>
using namespace std;
#include <ctime>
#include <cstdlib>
#include <climits>
#include <cassert>

struct res {
  int min;
  int max;
};

res minmax(int a[],int l,int r){
	if (r-l==1) {
		res fin;
		fin.min = a[l]; //O(1)
		fin.max = a[l];
		return fin;
    }
	int m=(l+r)/2;
  res u=minmax(a,l,m);
  res v=minmax(a,m,r);
  if (v.max > u.max){ 
    	u.max = v.max;
	}
	if (v.min < u.min){
		 u.min = v.min;
	}
	return u;
}


int main(int argc, char** argv){
	//We generate the vector
	if (argc != 2 && argc != 3){
		cerr << "Formato: " << argv[0] << " <num_elem> [<seed>]" << endl;
		return -1;
	}

	int n = atoi(argv[1]);
	
	int seed = 0;
	if(argc == 3){
		seed = atoi(argv[2]);
	}

	int * T = new int[n];
	assert(T);

	srand(seed);
	
	for (int j=0; j<n; j++) {
		T[j]=rand();
	}

	//Vector generated

	for (int j=0; j<n-1; j++){
		cout << T[j] << " ";
	}
	cout << T[n-1] << endl;
	
	  //Example:
    //int a[] = {34,23,45,56,30,31,57,33,55,10,58};
    //int a[] = {5,6,7,8,9};
    //int n = sizeof(T)/sizeof(int);
    res minimaxi = minmax(T,0,n);
    cout << "\nMin: " << minimaxi.min << " Max: " << minimaxi.max << endl;         
    return 0;
}
