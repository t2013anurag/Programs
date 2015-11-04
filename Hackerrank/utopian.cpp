#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n,sol,t,i;
scanf("%d",&t);
while(t-->0)
{
sol=1;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(i%2!=0)
		sol=sol*2;
		else
		sol=sol+1;
	}
	printf("%d\n",sol);
}
	system("pause");
	return 0;
}
