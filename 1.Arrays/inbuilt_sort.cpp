#include<iostream>
#include<algorithm>
using namespace std;

// Comparator
bool compare(int a, int b){
    // return a < b; // Ascending 1 2 3 4 5 6
    cout<< "Comparing a: "<<a<<" and b: "<<b<<endl;
    return a > b;   // Decending  6 5 4 3 2 1
}

int main() {

    int n;
    cin >> n;
    int a[n];

    for (int i = 0; i < n; i++)
    {
        cin >> a[i];
    }

    sort(a,a + n,compare);

    for (int i = 0; i < n; i++)
    {
        cout<< a[i] << " ";
    };

    return 0;
}
