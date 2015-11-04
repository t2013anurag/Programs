#include<stdio.h>
#include<stdlib.h>
#include<math.h>

int main()
{
	long int n,m;
	int t;
	scanf("%d",&t);
	while(t-->0)
	{
	scanf("%ld%ld",&n,&m);
	int i,c=0;
	for(i=1;;i++)
	{
		if(i*i>=n && i*i<=m)
		c++;
        else
            if(i*i>m)
            break;
	}
	printf("%d\n",c);
	}
	system("pause");
	return 0;
}
