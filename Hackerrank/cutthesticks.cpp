#include<stdio.h>
#include<stdlib.h>
int minimum(int a[],int p)
{
	int i,min=a[0];
	for(i=0;i<p;i++)
	{
		if(a[i]<=0)
		continue;

		else if(a[i]<min)
		min=a[i];
		
	}
	return min;
}
int main()
{
	int n,i,j;
	scanf("%d",&n);
	int a[1001];
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
while(1)
{
	int tmp;
	for(i=0;i<n;i++)
	{
		for(j=0;j<n-1-i;j++)
		{
			if(a[j]<a[j+1])
			{
				tmp=a[j];
				a[j]=a[j+1];
				a[j+1]=tmp;
			}
		}
	}
	int k=0,c=0;
	k=minimum(a,n);
	if(k<1)
	break;
	for(i=0;i<n;i++)
	{
		if(a[i]<=0)
		continue;
		a[i]=a[i]-k;
		c++;
	}
	printf("%d\n",c);
}
	system("pause");
	return 0;
}
