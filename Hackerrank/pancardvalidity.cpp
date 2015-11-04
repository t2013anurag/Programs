#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int check(char s)
{
	int ch=s;
	if(ch>=65 && ch<=90)
	return 1;
	else
	return 0;
}
int check1(char s)
{
	int ch=s;
	if(ch>=48 && ch<=57)
	return 1;
	else
	return 0;
}
int main()
{
int t;
scanf("%d",&t);
while(t-->0)
{
	int i,flag=0,flag1=0,flag2=0;
	char str[100];
	scanf("%s",str);
	for(i=0;i<5;i++)
	{
		if(check(str[i])!=1)
		{
			flag=1;
			break;
		}
		
		
	}
	if(flag==1)
	printf("NO\n");
	else
	{
		if(check(str[9])!=1)
		{
			flag1=1;
		}

		if(flag1==1)
		printf("NO\n");
		else
		{
			if(check1(str[i])!=1)
			{
				flag2=1;
			}
				if(flag2==1)
		printf("NO\n");
		else
		printf("YES\n");
		}
	
		}
			
}
	system("pause");
	return 0;
}
