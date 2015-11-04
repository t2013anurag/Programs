#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main()
{
   char string[100001], ch;
   int c = 0, count[26] = {0};
   
   scanf("%s",string);
   while ( string[c] != '\0' )
   {
      if ( string[c] >= 'a' && string[c] <= 'z' )
         count[string[c]-'a']++;
      c++;
   }
	int k=0;
   for ( c = 0 ; c < 26 ; c++ )
   {
      if(count[c]%2!=0)
      k++;
        
   }
   if(k>1)
   printf("NO");
   else
   printf("YES");

system("pause");
   return 0;

}
