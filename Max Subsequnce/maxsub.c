#include<stdio.h>
int max( int a[],int n)
{
int thissum,maxsum,i;
thissum=maxsum=0;
for(i=0;i<n;i++)
{
printf("Before thissum is %d and maxsum is %d\n",thissum,maxsum);
thissum+=a[i];
printf("After thissum is %d and maxsum is %d\n",thissum,maxsum);
if(thissum>maxsum)
maxsum=thissum;
else if(thissum<0)
thissum=0;
}
return maxsum;
}
int main()
{
int a[10],n,i;
printf("Enter the number of elements");
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("Enter the elements of the array"); 
scanf("%d",&a[i]);
}
int k=max(a,n);
printf("The Max subsequence is %d",k);
}


//this
