#include<iostream>
using namespace std;

bool compare(int a , int b){
    cout<< "Comparing a: "<<a<<" and b: "<<b<<endl;
    // return a > b;   // Ascending  1 2 3 4 5 6
    return a < b;   // Decending  6 5 4 3 2 1
}

// Receiving function
void bubbleSort(int a[],int n, bool (&cmp) (int a, int b)  ){
    for (int i = 0; i < n-1; i++)
    {
        for (int j = 0; j < (n-i-1) ; j++)
        {
            // Calling the function 
            if (cmp(a[j] , a[j+1]))
            {
                swap(a[j],a[j+1]);
            }
        }
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

    // Passing fuction
    bubbleSort(a,n,compare);

    for (int i = 0; i < n; i++)
    {
        cout<< a[i] << " ";
    };

    return 0;
}
