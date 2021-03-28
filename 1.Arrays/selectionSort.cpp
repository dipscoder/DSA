#include<iostream>
using namespace std;


void selectionSort(int a[],int n){
    int i;
    int min_index;

    // One by one move boundary of unsorted subarray 
    for (i = 0; i < n-1; i++)
    {
        // Find the minimum element in unsorted array 
        min_index = i;
        for (int j = i+1; j <= n-1; j++)
        {
            if (a[j] < a[min_index])
            {
                min_index = j;
            }
            
        }
        // Swap the found minimum element with the first element 
        swap(a[i],a[min_index]);   
    }
    
}

int main() {

    int n;
    cin >> n;
    int a[n];

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    selectionSort(a,n);

    for (int i = 0; i < n; i++)
    {
        cout<< a[i] << " ";
    };

    return 0;
}
