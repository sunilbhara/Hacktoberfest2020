#include<iostream>
using namespace std;


void swap(int *a, int *b){
	int temp=0;
	temp =*a;
	*a=*b;
	*b = temp;
}

void heapify(int arr[], int n, int i){
	int max=i;
	int left=2*i+1;
	int right=2*i+2;
	if(left<n && arr[left]>arr[max]){
		max=left;
	}
	if(right<n && arr[right]>arr[max]){
		max=right;
	}
	if(i!=max){
		swap(&arr[max], &arr[i]);
		heapify(arr,n,max);
	}
}

void heapsort(int arr[], int n){
	int i;
	for(i=(n/2-1);i>=0;i--){
		heapify(arr,n,i);
	}
	for(i=(n-1);i>=0;i--){
		swap(&arr[0], &arr[i]);
		heapify(arr,i,0);
	}
}

int main(){
	int n,i;
	cout<<"Enter size of heap\n";
	cin >> n;
	int arr[n];
	cout<<"Enter elements in heap\n";
	for(i=0;i<n;i++){
		cin>>arr[i];
	}
	heapsort(arr,n);
	cout<<"Elements in heap are :\n";
	for(i=0;i<n;i++){
		cout << arr[i]<<" ";
	}
	return 0;
}
