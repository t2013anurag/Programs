#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t-->0)
	{
	long int n,m,b,w,ch;
	cin>>n>>m;
	cin>>b>>w>>ch;
	long int total=0,total1=0;
	if(b==w)
	{
		total=(b*(n+m));
	}

	else if(b<w)
	{
		total=0;
		total=(b*n+ b*m + ch*m);
		total1=(b*n+m*w);
		if(total>total1)
		total=total1;
	}
	else if(b>w)
	{
        total=0;
		total=(w*n+ w*m + ch*n);
		total1=(b*n+m*w);
		if(total>total1)
		total=total1;
	}
   cout<<total<<endl;
}
	system("pause");
	return 0;
}
