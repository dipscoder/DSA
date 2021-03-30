#include<iostream>
using namespace std;

// Kadane's Algorithm
int main (){

    int n;
    cin>> n;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    
    int maxSum = 0;
    int currSum = 0;
    int start=0,end=0,s=0;

    // Subarrays
    for (int i = 0; i < n; i++)
    {
        currSum = currSum+a[i];
        if (currSum<0)      
        {
            currSum = 0;
            s = i + 1;
        }

        if (maxSum<currSum)
        {
            maxSum = currSum;
            start=s;
            end=i;
        }
        
        // maxSum = max(currSum,maxSum);
    }
    // Print max sum
    cout<<"Maximum Subarray Sum is: "<< maxSum<<endl;

    for (int i = start; i <= end; i++)
    {
        cout<<a[i]<<" ";
    }
    

    return 0;
}