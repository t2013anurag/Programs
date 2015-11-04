#include<stdio.h>
#include<stdlib.h>
int main()
{
int t;
	scanf("%d",&t);

while(t-->0)
{
    	long int a=0,b=1,c=0,k=0,i,n;
scanf("%d",&n);
	for(i=2;;i++)
	{
		c=(a+b)%10000000007;
		a=b%10000000007;
		b=c%10000000007;
		if(c==n)
		{
			k++;
			break;
		}
		else if(c>n)
		{
            printf("IsNotFibo\n");
            break;
		}
	}
	if(k==1)
	printf("IsFibo\n");
}

	system("pause");
	return 0;
}
