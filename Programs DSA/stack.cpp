#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define size 10
struct stack
{
int s[size];
int top;
}st;
int stfull(void)
{
if(st.top==size-1)
return(1);
else
return(0);
}
void push(int item)
{
st.top++;
st.s[st.top]=item;
}
int stempty(void)
{
if(st.top==-1)
return(1);
else
return(0);
}
int pop()
{
int item;
item=st.s[st.top];
st.top--;
return(item);
}
void display()
{
int i;
if(stempty())
printf("Underflow!!!");
else
for(i=st.top;i>=0;i--)
{
printf("%d\t",st.s[i]);
}
}
int main()
{
int choice,item;
char ans;
st.top=-1;

do
{
printf("\n 1.Push \n 2.Pop\n 3.Display\n 4.Exit");
printf("\n Enter your choice:");
scanf("%d",&choice);
switch(choice)
{
case 1:
printf("Enter the item u want to push:");
scanf("%d",&item);
if(stfull())
printf("Overflow!!!");
else
push(item);
break;
case 2:
if(stempty())
printf("Stack is empty:");
else
{
item=pop();
printf("The popped element is %d ",item);
}
break;
case 3:
display();
break;
case 4:
exit(0);
}
printf("\n Do u want to continue?");
ans=getche();
}
while(ans=='y');
getch();
return 0;
}
