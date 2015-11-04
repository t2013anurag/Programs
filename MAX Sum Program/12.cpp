#include<stdio.h>
#include<stdlib.h>
int MaxSum(int A[],int N)
{
	int ThisSum,Max,i,j,k;
Max=ThisSum=0;
	for(i=0;i<N;i++)
	{
	ThisSum+=A[i];
	if(ThisSum>Max)
	Max=ThisSum;
	else if(ThisSum<0)
	ThisSum=0;
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
