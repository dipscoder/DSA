#include<iostream>
#include<cstring>
using namespace std;

bool is_palindrome(char c[]){
    int i = 0;
    int j = strlen(c) - 1;

    while (i<j)
    {
        if (c[i]==c[j])
        {
            i++;
            j--;
        }
        else
        {
            return false;
        }   
    }
    return true;
}

int main(){

    char c[1000];
    cin>> c;
    if (is_palindrome(c))
    {
        cout<<"Palindrome"<<endl;
    }
    else
    {
        cout<<"Not a Palindrome"<<endl;
    }
    
    return 0;
}