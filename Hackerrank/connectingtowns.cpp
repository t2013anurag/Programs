#include<stdio.h>
#include<stdlib.h>

int main()
{
int t;
scanf("%d",&t);
while(t-->0)
{

	
	
		int n;
		scanf("%d",&n);
		int a[n];
		int i;
		long int ans=1,final=0;
		for(i=0;i<n-1;i++)
		scanf("%d",&a[i]);
		for(i=0;i<n-1;i++)
		{
		ans=(ans*a[i])%1234567;
		
		}
		printf("%ld\n",ans);
}
	system("pause");
	return 0;
}
