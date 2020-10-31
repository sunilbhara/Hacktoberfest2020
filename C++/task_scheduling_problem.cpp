#include<iostream> 
#include<algorithm> 
using namespace std; 


struct Task{ 
char id;	 
int deadline;
int profit;
}; 


bool comparison(Task a, Task b){ 
	return (a.profit > b.profit); 
} 


void printTaskScheduling(Task arr[], int n){

	sort(arr, arr+n, comparison); 

	int result[n]; 
	bool gap[n]; 


	for (int i=0; i<n; i++){
		gap[i] = false; 
	}


	for (int i=0; i<n; i++){ 

		for (int j=min(n, arr[i].deadline)-1; j>=0; j--){ 

			if (!gap[j]){ 
				result[j] = i;
				gap[j] = true; 
				break; 
			} 
		} 
	} 


	for (int i=0; i<n; i++){
		if (gap[i]){
			cout << arr[result[i]].id << " "; 
		}
	}
} 


int main(){ 
	Task arr[] = { {'a', 2, 100}, {'b', 1, 19}, {'c', 2, 27}, {'d', 1, 25}, {'e', 3, 15}}; 
	int n = sizeof(arr)/sizeof(arr[0]); 
	cout << "Tasks that give most profit: \n"; 
	printTaskScheduling(arr, n); 
	return 0; 
}
