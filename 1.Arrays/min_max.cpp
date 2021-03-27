#include<iostream>
#include<climits>
using namespace std;

int main() {
    int n;
    cin>> n;
    int a[n];

    for (int i = 0; i < n; i++)
    {
        cin >> a[i] ;
    }
    
    // Take lagest --> -infinite & smallest --> +infinite
    int largest = INT_MIN;
    int smallest = INT_MAX;

    // for (int i = 0; i < n; i++)
    // {
    //     if (a[i] > largest)
    //     {
    //         largest = a[i];
    //     }
    //     if (a[i] < smallest)
    //     {
    //         smallest = a[i];
    //     }
        
    // }
    // 2nd method 
    for (int i = 0; i < n; i++)
    {
        largest = max(largest,a[i]);
        smallest = min(smallest,a[i]);
    }
    cout<< "Largest: "<< largest << " Smallest: "<< smallest;
    
    return 0;
}