#include<iostream>
#include<algorithm>
using namespace std;

// Pair Sum Problem - Given a SORTED array, Find pair of elements that sum to K(given) 
// Using two pointer approach
int main(){

    int n;
    cin>>n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin>>a[i];
    }

    sort(a,a+n);
    
    int k;
    cout<<"Key: ";
    cin>>k;
    int i = 0;
    int j = (sizeof(a)/sizeof(int)) - 1;

    while (j>i)
    {
        if (a[i]+a[j] < k)
        {
            i++;
        }
        else if (a[i]+a[j] > k)
        {
            j--;
        }
        else if(a[i]+a[j] == k){
            cout<<"("<<a[i]<<","<<a[j]<<")"<<endl;
            i++;
            j--;
        }
        
    }
     
    return 0;
}