#include <iostream>

using namespace std;

int main()
{
    int arraySize = 0;

    cout << "Number of elements in the array: ";
    cin >> arraySize;

    int v[arraySize];

    for(int i = 0; i < arraySize; i++)
    {
        cout << "Element # " << i+1 << ": ";
        cin >> v[i];
    }

    for(int i = 0; i < arraySize; i++)
        for (int j = 1; j < arraySize; j++)
            if(v[i] > v[j])
            {
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }

    int maxGap = 0;

    if(arraySize >= 2) {
    for (int i = 0; i < arraySize - 1; i++)
        if (v[i] - v[i + 1] > maxGap)
            maxGap = v[i] - v[i + 1];
    }

    cout << "Max gap: " << maxGap;

    return 0;
}
