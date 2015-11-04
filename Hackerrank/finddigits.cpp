#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t,n,m,max,d;
    cin>>t;
    while(t--)
    {
        cin>>n;
        m=n;
        max=0;
        while(m)
        {
            d=m%10;
            if(d)
            {
                if(n%d==0)
                max++;
            }
            m/=10;
        }
        cout<<max<<endl;

    }
    return 0;
}
