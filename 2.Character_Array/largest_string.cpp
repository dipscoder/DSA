#include<iostream>
#include<cstring>
using namespace std;

int main(){

    int n;
    cin>>n;

    cin.get();
    char c[1000];
    char largest[1000];

    int current_len = 0;
    int largest_len=0;
    for (int i = 0; i < n; i++)
    {
        cin.getline(c,1000);
        // cout<<c<<endl; 
        current_len = strlen(c);
        if (current_len > largest_len)
        {
            largest_len = current_len;
            strcpy(largest,c);
        }
        
    }

    cout<<"Largest string: "<<largest<<" and its length is "<<largest_len;

    return 0;
}