
#include<stdio.h>

int main()
{

int  w;
float b;
scanf("%d",&w);
scanf("%f",&b);
if((w>0 && w<=2000) && (b>0 && b<=2000))
{
if((b-(w+0.5))>0 && (w%5)==0)
printf("%.2f",(b-(w+0.5)));
else
printf("%.2f",b);
}
return 0;

}
