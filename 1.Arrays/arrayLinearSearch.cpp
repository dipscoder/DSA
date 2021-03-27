#include<iostream>
using namespace std;

int main() {
    
    int a[8] = {1,22,34,35,32,12,12,10};
    int key;
    cout<< "Enter key: ";
    cin >> key;

    int n = sizeof(a)/sizeof(int);
    int i;
    for (i = 0; i <= n-1; i++)
    {
        if (a[i] == key)
        {
            cout <<  "Index of key: " << i ;
            break;
        }
            
    }
    if (i == n){
        cout << "Key not found!";
    }

    
    
    return 0;
}