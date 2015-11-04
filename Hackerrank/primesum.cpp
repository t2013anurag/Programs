#include<stdio.h>
#include<stdlib.h>
int prin(int x)
{
int i,c=0;
	for(i=1;i<=x;i++)
	{
		if(x%i==0)
		c++;
	}
	if(c==2)
	return 1;
	else
	return 0;
}
int main()
{
int j,i,n,t,sum;
scanf("%d",&t);
for(j=0;j<t;j++)
{
sum=0;

	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		if(prin(i)==1)
		sum=sum+i;
	}
	printf("%d\n",sum);

}
	
	return 0;
}
