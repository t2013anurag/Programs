#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define size 10
struct queue
{
int que[size];
int front,rear;
}q;
int full()
{
if(q.rear>=size-1)
return(1);
else
return(0);
}
int insert(int item)
{
if(q.front==-1)
q.front++;
q.que[++q.rear]=item;
return q.rear;
}
int empty()
{
if((q.front==-1)||(q.front>q.rear))
return(1);
else
return(0);
}
int delet()
{
int item;
item=q.que[q.front];
q.front++;
printf("\n the deleted itemis%d",item);
return q.front;
}
void display()
{
int i;
for(i=q.front;i<=q.rear;i++)
printf("%d\n",q.que[i]);
}
int main()
{
int choice,item;
char ans;

q.front=-1;
q.rear=-1;
do
{
printf("\nmenu");
printf("\n 1.insert \n 2.delete \n 3.display");
printf("\n enter ur choice");
scanf("%d",&choice);
switch(choice)
{
case 1:
if(full())
printf("\n cannot insert element:");
else
{
printf("enter the item u wnat to insert:");
scanf("%d",&item);
insert(item);
}
break;
case 2:
if(empty())
printf("\n queue is under flow:");
else
delet();
break;
case 3:
if(empty())
printf("queue is empty");
else;
display();
break;
}
printf("\n do u wnat to continue?");
ans=getche();
}
while(ans=='y');
getch();
return 1;
}




