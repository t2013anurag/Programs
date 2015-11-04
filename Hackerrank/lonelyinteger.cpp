#include<stdio.h>
#include<stdlib.h>
int main()
{
int b,a,i,n;
a = 0;
scanf("%d",&n);
for (i=0;i<n;i++)
{
   scanf("%d",&b);
    a ^= b;
}
printf("%d",a);
return 0;
}


// Lonely integer :

// a xor a =0
// so a xor a xor a xor b xor a
// a^a^b^b^a=a
