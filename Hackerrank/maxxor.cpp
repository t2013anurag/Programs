#include<stdio.h>
#include<stdlib.h>
int main()
{
	int l,r,i,max=0,ch=0,j;
	scanf("%d%d",&l,&r);
	for(i=l;i<=r;i++)
	{
		for(j=i;j<=r;j++)
		{
		ch=i^j;
		if(ch>max)
		max=ch;
		}
}
	printf("%d",max);
	return 0;
}
