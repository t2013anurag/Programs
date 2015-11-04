#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
	char str[10000],t;
    long int c,i;
	scanf("%d",&t);
while(t--)
{
    c=0;

	scanf("%s",&str);
	for(i=0;i<strlen(str)/2;i++)
	{
		c+=abs(str[i]-str[strlen(str)-1-i]);
	}
	printf("%d\n",c);
}


	return 0;
}
