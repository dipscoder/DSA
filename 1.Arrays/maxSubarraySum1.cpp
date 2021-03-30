#include<iostream>
using namespace std;


int main (){

    int n;
    cin>> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    
    int maximumSum = 0;
    int currentSum = 0;
    int left = -1;
    int right = -1;

    // Subarrays
    for (int i = 0; i < n; i++)
    {
        for (int j = i; j < n; j++)
        {
            currentSum = 0;
            for (int k = i; k <= j; k++)
            {
                currentSum += a[k];     
      
            }
            // cout<<currentSum<<endl;
            if (currentSum > maximumSum)
            {
                maximumSum = currentSum;
                left = i;
                right = j;     
            }   
        }
    }
    // Print max sum
    cout<< maximumSum<<endl;
    
    // Print subarray with max sum
    for (int i = left; i <= right; i++)
    {
        cout<<a[i]<<" ";
    }

    // Input
    // 7
    // 2 -4 1 9 -6 7 -3
    
    // Output
    // 11    
    // 1 9 -6 7

    return 0;
}