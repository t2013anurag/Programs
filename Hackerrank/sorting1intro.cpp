#include<stdio.h>
#include<stdlib.h>
int main()
{
	int i,v,n,index=0;
	scanf("%d%d",&v,&n);
	int a[n];
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	for(i=0;i<n;i++)
	{
		if(a[i]==v)
		index=i;
	}
	printf("%d",index);
	system("pause");
	return 0;
}
