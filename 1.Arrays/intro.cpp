#include<iostream>
using namespace std;

int main() {
    //Initialize 
    // int a[10]; Garbage values
    // int a[10] = {0}; // -> 0 0 0 0 0 0 0 0 0 0
    int a[10] = {1,2,3}; // -> 1 2 3 0 0 0 0 0 0 0 

    // Input
    // for (int i = 0; i < 10; i++)
    // {
    //     cin >> a[i] ;
    // }

    // Length of the array
    int sizeOfArr = sizeof(a);
    cout<< sizeOfArr << endl ;

    int totalElement = sizeof(a)/sizeof(int);
    cout<< totalElement << endl ;

    // Update single index
    a[7] = 77;
    
    // Output
    for (int i = 0; i < 10; i++)
    {
        cout<< a[i] << " ";
    }
    
    
    return 0;
}