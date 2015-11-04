#include<stdio.h>
#include<stdlib.h>
int main()
{
	long int n,m;
	scanf("%ld%ld",&n,&m);
	long int sum=0;
	long int b,a,candy;
	while(m-->0)
	{
		scanf("%ld%ld%ld",&a,&b,&candy);
         sum = sum + (b-a+1)*(candy);

	}
	sum = sum/n;
	printf("%ld\n",sum);
	system("pause");
	return 0;
}
