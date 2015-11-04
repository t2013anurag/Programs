#include<stdio.h>
#include<stdlib.h>
int main()
{
	unsigned int n;
	int t;
	scanf("%d",&t);
	while(t-->0)
	{
	scanf("%u",&n);
	printf("%u\n",~n);
	}
	system("pause");
	return 0;
}
