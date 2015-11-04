#include <stdio.h>
#include <conio.h>
void main( )
{
	int arr[50] ;
	int i, j, n,temp ;
	clrscr();
	printf("Enter the size of array:");
	scanf("%d",&n);
	printf("\nEnter the item in array:\n");
	for(i = 0 ; i < n ; i++)
	{
		scanf("%d",&arr[i]);
	}
	for ( i = 0 ; i < n ; i++ )
	{
		for ( j = 0 ; j <= n - i ; j++ )
			if ( arr[j] > arr[j + 1] )
				temp = arr[j] ;
				arr[j] = arr[j + 1] ;
				arr[j + 1] = temp ;
	}
	printf ( "\nArray after sorting:") ;
	for ( i = 0 ; i < n ; i++ )
		printf ( "%d\t", arr[i] ) ;
   getch();
}
