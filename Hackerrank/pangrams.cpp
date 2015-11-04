#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include<string.h>
#include<stdio.h>
#include<ctype.h>
int main()
{
char str[10001],s[1000];
gets(str);
char c;int i=0;
for(i = 0; str[i]; i++)
	{
  	s[i] = tolower(str[i]);
	}
char ch;
int c1[26]={0};
for(int i=0;s[i];i++)
{
	ch=s[i];
	c1[(int)ch-'a']++;
}
int flag=0;
for(int i=0;i<26;i++)
{
if(c1[i]==0)
{
flag=1;
break;
}
}
if(flag==1)
printf("not pangram");
else
printf("pangram");
system("pause");
return 0;
}
