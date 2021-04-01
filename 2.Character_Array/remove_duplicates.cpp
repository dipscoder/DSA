#include<iostream>
#include<cstring>
using namespace std;

// Remove consecutive duplicates 
void remove_duplicates(char a[]){

    int len = strlen(a);
    if (len == 1 || len == 0)
        return;
        
    int prev = 0;
    for (int current = 0; current < len; current++)
    {
        if(a[current] != a[prev])
        {
            prev++;
            a[prev] = a[current];
        } 
    }
    a[prev+1] = '\0';
    
}

int main(){

    char a[1000];
    cin>>a;
    
    remove_duplicates(a);
    cout<<a;
    return 0;
}