#include <stdio.h>
#include <stdlib.h>   
int compare (const void * a, const void * b)
{
  return ( *(int*)a - *(int*)b );
}

int main ()
{
int i,n,test,t;
scanf("%d",&t);
while(t-->0)
{


  scanf("%d",&test);

scanf("%d",&n);
int a[n];

for(i=0;i<n;i++)
scanf("%d",&a[i]);
int b[n];
for(i=0;i<n;i++)
b[i]=a[i];
  qsort (a, n, sizeof(int), compare);

     
     int sum=0,j,l=0,u=n-1,ind,ind1;

     while(l<=u)
     {
		sum=a[l]+a[u];
		if(sum>test)
		{
			u--;
		}
		else if(sum<test)
		{
			l++;
		}
		else
		{
		
			 ind=a[l];
			 ind1=a[u];
			break;
		}
     }
     int indexl,indexu;
 for(i=0;i<n;i++)
 {
		if(a[l]==b[i])
		indexl=i;
 }
  for(i=0;i<n;i++)
 {
		if(a[u]==b[i])
		indexu=i;
 }
 int tmp;
if(indexl<indexu)
     printf("%d\t%d\n",indexl+1,indexu+1);
     else
     printf("%d\t%d\n",indexu+1,indexl+1);
}
     system("pause");
  return 0;
}
