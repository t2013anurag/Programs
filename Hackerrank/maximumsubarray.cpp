#include<stdio.h>
#include<stdlib.h>
int min(int a[],int n)
{
	int i,mini=a[0];
	for(i=0;i<n;i++)
	{
		if(mini<a[i])
		mini=a[i];
		
	}

	return mini;
}
int max( int a[],int n)
{
int thissum,maxsum,i;
thissum=maxsum=0;
for(i=0;i<n;i++)
{
thissum+=a[i];
if(thissum>maxsum)
maxsum=thissum;
else if(thissum<0)
thissum=0;
}
return maxsum;
}
int max1( int a[],int n)
{
int thissum,maxsum,i;
thissum=maxsum=0;
for(i=0;i<n;i++)
{
if(a[i]<0)
continue;
else
thissum+=a[i];
if(thissum>maxsum)
maxsum=thissum;
else if(thissum<0)
thissum=0;
}
return maxsum;
}
int main()
{
int a[100000],n,i;
int t;
scanf("%d",&t);
while(t-->0)
{
scanf("%d",&n);
for(i=0;i<n;i++)
{
scanf("%d",&a[i]);
}
int check=0;int k=0,k1=0,k11=0,c=0;

for(i=0;i<n;i++)
{
	if(a[i]<0)
	check=1;
}

if(check==1)
{
	for(i=0;i<n;i++)
	if(a[i]<0)
	c++;

	if(c==n)
	{
	k=min(a,n);
	k1=min(a,n);
	}
	else{

 k=max(a,n);
 k1=max1(a,n);
}
}

else
{
 k=max(a,n);
 k1=max(a,n);
}

printf("%d\t%d\n",k,k1);
}
system("pause");
}

