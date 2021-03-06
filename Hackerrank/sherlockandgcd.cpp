#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int gcd(int a, int b)
{
    if(b==0)return a;
    return gcd(b,a%b);
}
int main()
{
    int t;
    cin >> t;
    while(t--)
    {
        int n,i,j,gc=0;
        cin >> n;
        for(i=0; i<n; i++)
        {
            cin >> j;
            gc=gcd(gc,j);
        }
        if(gc==1)cout << "YES\n";
        else cout << "NO\n";
    }
    return 0;
}
