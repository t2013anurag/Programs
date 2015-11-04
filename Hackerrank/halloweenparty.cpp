#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
   long int t,n,m,ans,k,d;
    cin>>t;
    while(t--)
    {
        cin>>k;
       
       if(k%2==0)
       {
		ans=k/2;
       ans=ans*ans;
}
else
{
	ans=k/2;
	ans=ans*(ans+1);
}
	    cout<<ans<<endl;

    }
    return 0;
}
