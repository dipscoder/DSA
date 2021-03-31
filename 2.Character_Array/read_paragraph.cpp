#include<iostream>
using namespace std;


void read_para(char a[],int maxLen,char deLim = '\n'){
    int i=0;
    char ch = cin.get();
    while (ch != deLim)
    {
        a[i] = ch;
        i++;
        if (i == maxLen-1)
        {
            break;
        }
        ch = cin.get();
    }
    a[i] = '\0';
    return;
}


int main(){
    
    char c[1000];
    // cin Problem - it terminates after the space. In- "Hello world" but Out-"Hello" 
    // cin>> c;
    // read_para(c,1000,'$');
    cin.getline(c,1000, '$');    // same as above but inbuilt 
    cout<< c;
    return 0;
}