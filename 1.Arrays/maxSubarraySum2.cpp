#include<iostream>
using namespace std;

// Cumulative Sum Method 
int main (){

    int n;
    cin>> n;
    int a[n];
    // cumulative sum array
    int cumSum[n];

    cin>>a[0];
    cumSum[0] = a[0];
    //* We start from 1 so as to avoid the negative index of array.
    for (int i = 1; i < n; i++)
    {
        cin >> a[i];
        cumSum[i] = cumSum[i-1] + a[i];
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
           if(i-1>=0){
                currentSum=cumSum[j]-cumSum[i-1];
            }
            else{
                currentSum=cumSum[j];
            }

            // currentSum=cumSum[j]-cumSum[i-1];
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