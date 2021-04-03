#include<iostream>
using namespace std;

int main(){

    // Initialization
    string s0;
    string s1("Hello ji");
    string s2 = "Hello world";
    string s3(s2);  // Copy s2 in s3
    string s4 = s3;
    char a[] = {'a','b','c','\0'};
    string s5(a);

    cout<<s0<<endl;             
    cout<<s1<<endl;     //Hello ji
    cout<<s2<<endl;     //Hello world
    cout<<s3<<endl;     //Hello world
    cout<<s4<<endl;     //Hello world
    s3 = "Hello duniya";
    cout<<s3<<endl;     //Hello duniya
    cout<<s4<<endl;     //Hello world
    cout<<s5<<endl;     //abc

    if (s0.empty())
    {
        cout<<"s0 is empty"<<endl;
    }
    
    // Append
    s0.append("yoo mann");
    cout<<s0<<endl;
    s0 += ", wass uppp"; 
    cout<<s0<<endl;

    //Remove
    cout<<s0.length()<<endl;    // 19
    s0.clear();
    cout<<s0.length()<<endl;    // 0

    // Compare
    s0 = "Orange";
    s1 = "Banana";
    /*Lexicographical ordering means dictionary order. 
    For ex: In dictionary 'ado' comes after 'adieu' because 'o' comes after 'i' in English alphabetic system. 
    This ordering is not based on length of the string, but on the occurrence of the smallest letter first.*/
    cout<< s0.compare(s1)<<endl;    //1 s0>s1 , comparing s0 with s1
    cout<< s1.compare(s0)<<endl;    //-1 s1<s0
    cout<< s0.compare(s0)<<endl;    //0 - same 

    if (s0>s1)
    {
        cout<<s0<<" is greater than "<<s1<<endl;
    }
    
    // Index
    cout<<s0[0]<<endl;

    //  Find substring
    string s = "I love going to gym and pizzahut";
    int idx = s.find("gym");
    cout<<idx<<endl; 

    // Remove a word 
    string word = "gym and";
    int len = word.length();
    cout<<s<<endl;
    s.erase(idx,len+1); //+1 for space
    cout<<s<<endl;     
    
    // Itearate over the string
    //=> 1.Simple methode
    for (int i = 0; i < s1.length(); i++)
    {
        cout<<s1[i]<<":";
    }
    cout<<endl;
    
    //=> 2.Iterators
    /*The auto keyword specifies that the type of the variable that is begin declared will automatically be deduced from its initializer and for functions
     if their return type is auto then that will be evaluated by return type expression at runtime.*/
    for (auto it = s1.begin(); it != s1.end() ; it++)
    {
        cout<<(*it)<<",";
    }
    cout<<endl;
    for (string::iterator it = s1.begin(); it != s1.end() ; it++)   // Datatype for iterator="string::iterator"(if you don't want to use "auto")
    {
        cout<<(*it)<<",";
    }
    cout<<endl;

    //=> 3.Foreach loop
    for (auto c : s1)
    {
        cout<<c<<".";
    }
    cout<<endl;
    for (char c : s1)
    {
        cout<<c<<".";
    }
    
    return 0;
}