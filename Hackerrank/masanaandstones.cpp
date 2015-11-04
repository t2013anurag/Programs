#include<stdio.h>
#include<stdlib.h>
int main()
{
	int t;
	scanf("%d",&t);
	while(t-->0)
	{
	int n,a,b,i;
	scanf("%d%d%d",&n,&a,&b);
	int tmp;
	if(a>b)
	{
		tmp=a;
		a=b;
		b=tmp;
	}
	int c[n],k=0;
	for(i=0;i<=n-1;i++)
	{
		c[k++]=i*a+(n-i-1)*b;
		
	}
	if(a==b)
	printf("%d\n",c[k-1]);
	else
	{
	for(i=k-1;i>=0;i--)
	printf("%d\t",c[i]);
	printf("\n");
	}
}
	system("pause");
	return 0;
}
