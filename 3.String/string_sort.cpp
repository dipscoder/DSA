#include<iostream>
#include<algorithm>
using namespace std;

bool compare(string a, string b){
    if (a.length() == b.length())   // If lengths are same
    {   
        return a < b;   // Then print string with lower lexicographic value
    }
    
    return a.length() > b.length();     // print biggest string first
}

int main(){
    int n;
    cin>>n;
    cin.get();

    string s[1000];
    for (int i = 0; i < n; i++)
    {
        getline(cin,s[i]);      // this how we write getline function for strings
    }

    sort(s,s+n,compare);    // Byfault sort lexicographically 
    for (int i=0;i<n;i++)
    {
        cout<<s[i]<<endl;
    }
    
    

    return 0; 
}