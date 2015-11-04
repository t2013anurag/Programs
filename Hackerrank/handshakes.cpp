#include<stdio.h>
#include<stdlib.h>
int main()
{
	int t;
	int shakes;
	scanf("%d",&t);
	while(t-->0)
	{
		int n;
		scanf("%d",&n);
		if(n==0)
		shakes=0;
		else
		shakes=(n*(n-1))/2;

	printf("%d\n",shakes);
	}
	system("pause");
	return 0;
}
