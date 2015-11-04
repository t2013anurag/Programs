#include<stdio.h>
#include<stdlib.h>

int gcd ( int a, int b)
    {
    if(a==0)
        return b;
    else if(b==0)
        return a;
    else
        return gcd(b,a%b);
    }
int main()
{
	int t;
	scanf("%d",&t);
	while(t-->0)
	{
	int total=0,a,b;
	scanf("%d%d",&a,&b);
	total=((a*b)/(gcd(a,b)*gcd(a,b)));
	printf("%d",total);
	}
	system("pause");
	return 0;
}
