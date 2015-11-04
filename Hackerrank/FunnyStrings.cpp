#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int i,t,f;
    string s,r;
    cin>>t;
    while(t-->0)
        {
    cin>>s;
    r=s;
    f=0;
    for(i=0;i<s.length();i++)
        r[i]=s[s.length()-i-1];
    for(i=1;i<s.length();i++)
        {
        if(abs(s[i]-s[i-1])!=abs(r[i]-r[i-1])){
            f++;
            break;
        }
    }
    if(f)
        cout<<"Not Funny\n";
    else
        cout<<"Funny\n";
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    return 0;
}
