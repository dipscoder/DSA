#include<iostream>
using namespace std;

int main() {
    // Initialization
    char a[] = {'h','e','y','a'};
    char b[10] = {'h','e','y','a'};
    char c[10] = {'h','e','y','a','\0'};    //Recommended to null character(\0) at the end of the character array, Otherwise it can print some garbage value
    int i[10] = {1,2,3};

    // Output - no need of loops
    cout<<i<<endl;  //Address of the first element 
    cout<<a<<endl;  // Whole char array 
    cout<<b<<endl;  // * Also, cout will print char array until it finds the null character not according to the size of the array
    cout<<c<<endl;

    // Input - no need of loop
    char s[10];
    cin >> s;   // Here cin will take input as a string and add '\0' at the end of the string
    cout<< s<<endl;

    // Lenght with and without null character
    char c1[] = {'h','i','i'};  //doesn't terminate with null character 
    char c2[] = "hii";  // null character added automatically at the end 

    cout<< c1 << " Size is: "<< sizeof(c1)<< endl;  //Output - hiixzy Size is 3 , here 'xyz' is some garbage
    cout<< c2 << " Size is: "<< sizeof(c2)<< endl;  // hii Size is 4  
    
    return 0;
}