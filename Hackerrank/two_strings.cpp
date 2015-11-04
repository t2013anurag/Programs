#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
	int t;
	scanf("%d",&t);
	while(t-->0)
	{
	char str1[100001],str2[100001];
	scanf("%s",&str1);
	scanf("%s",&str2);
	int l=strlen(str1);
    int l1=strlen(str2);
	int a[l],b[l1];
	int c=0;
	int i=0,j=0;
for(i=0;i<l;i++)
{
	if((int)str1[i]==(int)str2[j])
	{
		c=1;
		break;
	}
	else
	{
		j++;
		if(j>l1)
		break;
	}
}
if(c)
printf("YES\n");
else
printf("NO\n");

}
system("pause");
    return 0;
}

