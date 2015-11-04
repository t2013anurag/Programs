#include<stdio.h>
#include<stdlib.h>
int main()
{
	int n;
	scanf("%d",&n);
	int a[n][n],i,j;

for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	scanf("%1d",&a[i][j]);
}

	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
            if(i==0 || j==0 || i == n-1 || j == n-1)
				continue;
			if(a[i][j]>a[i+1][j] && a[i][j]>a[i-1][j] && a[i][j]>a[i][j-1] && a[i][j]>a[i][j+1] )
			a[i][j]='X';
		}
	}
	for(i=0;i<n;i++)
	{
		for(j=0;j<n;j++)
		{
				if(a[i][j]!='X')
			printf("%d",a[i][j]);
			else
			printf("%c",a[i][j]);
		}
		printf("\n");
	}

	system("pause");
	return 0;
}
