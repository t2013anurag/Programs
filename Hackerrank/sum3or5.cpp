#include<stdio.h>
#include<stdlib.h>
int main()
{
	int t;
	scanf("%d",&t);
	while(t-->0)
	{
		int n,i;
		scanf("%d",&n);
		int sum=0;
		for(i=1;i<n;i++)
		{
			if(i%3==0 || i%5==0)
			sum+=i;
		}
		printf("%d\n",sum);
 }
	system("pause");
	return 0;
}
