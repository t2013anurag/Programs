#include<stdio.h>
#include<conio.h>
int main()
{
	int A[20],n,Temp,i,j;
	printf("\n\t\t\t-----INSERTION SORT-----\n\n");
	printf("\n\n ENTER THE NUMBER OF TERMS...: ");
	scanf("%d",&n);
	printf("\n ENTER THE ELEMENTS OF THE ARRAY...:\n");
	for(i=0; i < n;i++)
	{
		scanf("%d", &A[i]);
	}
	for(i=1; i< n; i++)
	{
		Temp = A[i];
		j = i-1;
		while(Temp < A[j] && j>=0)
		{
			A[j+1] = A[j];
			j = j-1;
		}
		A[j+1] = Temp;
	}
	printf("\n\t\t\t-------INSERTION SORTED ELEMENTS------\n\n");
	printf("\nTHE ASCENDING ORDER LIST IS...:");
	for(i=0; i < n; i++)
	{
		printf("\t%d", A[i]);
	}
	getch();
}
