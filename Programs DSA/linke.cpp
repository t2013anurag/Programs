#include<stdio.h>
#include<conio.h>
typedef struct NODE
{
int data;
struct NODE *next;
}node;
node n1,n2,n3,n4;
node *one,*temp;
main()
{

n1.data=10;
n1.next=&n2;
n2.data=20;
n2.next=&n3;
n3.data=30;
n3.next=&n4;
n4.data=40;
n4.next=NULL;
one=&n1;
temp=one;
while(temp!=NULL)
{
printf("\n%d",temp->data);
temp=temp->next;
}
getch();
}
