#include<stdio.h>
#include<stdlib.h>
int main()
{
	int money,cost,extra,result=0,t;
	scanf("%d",&t);
	while(t-->0)
	{
	scanf("%d%d%d",&money,&cost,&extra);
	money = money / cost;
	result = money + (money - 1) / (extra - 1);
	printf("%d\n",result);
	}
	system("pause");
	return 0;
}
