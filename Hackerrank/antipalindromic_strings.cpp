#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
long long int expo(int a, int b){
    long long int result = 1;

    while (b>0){
        result *= a;
        b--;
    }

    return result;
}
int main()
{
	long int t;
	cin>>t;
	while(t-->0)
	{
	long long int n,m,sum=0;
	cin>>n>>m;
	if(n==1)
	sum=m;
	else if(n==2)
	sum=m*(m-1);
	else
		sum=(m*(m-1)*expo(m-2,n-2));
 cout<<sum%1000000007<<endl;
}
    system("pause");
	return 0;

}
