#include<stdio.h>
#include<stdlib.h>
int main()
{
int i,n,t,min,b,c;
scanf("%d%d",&n,&t);
int a[n];
for(i=0;i<n;i++)
scanf("%d",&a[i]);
while(t-->0)
{
scanf("%d%d",&b,&c);
min=a[b];
for(i=b;i<=c;i++)
{
if(a[i]<min)
min=a[i];
}
printf("%d\n",min);
}
return 0;
}
