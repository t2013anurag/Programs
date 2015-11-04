#include<stdio.h>
#include<stdlib.h>
int main()
{
	int t;
	int draws;
	scanf("%d",&t);
	while(t-->0)
	{
		int n;
		scanf("%d",&n);
		if(n==1)
		draws=2;
		else
		draws=n+1;

	printf("%d\n",draws);
	}
	system("pause");
	return 0;
}
