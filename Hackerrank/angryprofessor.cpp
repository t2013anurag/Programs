#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n,k,i,j,tmp,t;
	scanf("%d",&t);
	while(t-->0)
	{

	scanf("%d%d",&n,&k);
	int a[n];
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);

	for(i=0;i<n;i++)
	{
		for(j=0;j<n-1-i;j++)
		{
			if(a[j]>a[j+1])
			{
				tmp=a[j];
				a[j]=a[j+1];
				a[j+1]=tmp;
			}
		}
	}
	int c=0;
	for(i=0;i<n;i++)
	{
		if(a[i]<=0)
		c++;
	}

	if(c<k)
	printf("YES\n");
	else
	printf("NO\n");
}
	system("pause");
	return 0;
}
