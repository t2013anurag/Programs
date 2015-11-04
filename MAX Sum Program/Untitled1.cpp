#include<stdio.h>
#include<stdlib.h>
int MaxSum(int A[],int N)
{
	int ThisSum,Max,i,j,k;
Max=0;
	for(i=0;i<N;i++)
	{
		for(j=0;j<N;j++)
		{
			ThisSum=0;
			for(k=i;k<=j;k++)
			ThisSum+=A[k];
			if(ThisSum>Max)
			Max=ThisSum;
		}
	}
	return Max;
}
int main()
{
int a[10],n;
scanf("%d",&n);
for(int i=0;i<n;i++)
scanf("%d",&a[i]);
int k=MaxSum(a,n);
printf("%d is the Maximum Sum " ,k);
system("pause");
return 0;
}
