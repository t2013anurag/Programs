#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<ctype.h>
int main()
{
	char str[100000];
int t;
scanf("%d",&t);
	while(t-->0)
	{

 scanf("%s",str);
	int i,k=0;
int ch,ch1;
	for(i=0;i<strlen(str);i++)
	{
		ch=str[i];
		ch1=str[i+1];
		if(ch==ch1)
		k++;
	
	}
	printf("%d\n",k);
}
	system("pause");
	return 0;
}
