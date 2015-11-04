#include<stdio.h>
#include<stdlib.h>
int main()
{
	int m,n,i,k,sum=0;
	scanf("%d%d",&m,&n);
	int a[n];
	for(i=0;i<n;i++)
	scanf("%d",&a[i]);
	for(i=0,k=0;i<n,k<2;i++,k++)
	{
		sum=sum+a[i];
		if(sum>m)
		sum=0;

		
	}
	printf("%d",sum);
	system("pause");
	return 0;
}
