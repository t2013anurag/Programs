#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#define max 5
int q[max];
int rear = -1, front = -1;
void insert();
void delet();
void display();

int main()
{
 char ch;
 int choice;
 do
 {
  
  printf("\n1 -> Insert");
  printf("\n2 -> Delete");
  printf("\n3 -> Display");
  printf("\n0 -> Exit");

  printf("\n\nEnter Your Choice -> ");
  scanf("%d", &choice);
  switch (choice)
  {
  case 1:
   insert();
   break;
  case 2:
   delet();
   break;
  case 3:
   display();
   break;
  case 0:
   exit(0);
  default:
   printf("\n\nInvalid Choice");
  }
  printf("\n\nDo u Want to Continue -> ");
  ch = getche();
 } while (ch == 'y' || ch == 'Y');
 return 0;
}

void insert()
{
 int data;
 if ((rear == max - 1 && front == 0) || rear == front - 1)
 {
  printf("\nSorry! Q is Full");
 }
 else
 {
  printf("\nEnter data You want to insert ->");
  scanf("%d", &data);
  if (front == -1)
  {
   front++;
   rear++;
  }
  else if (rear == max - 1)
  {
   rear = 0;
  }
  else
  {
   rear++;
  }
  q[rear] = data;
  printf("\n\nData inserted successfully");
 }
}
void delet()
{
 if (front == -1)
 {
  printf("\n\nSorry! Q is Empty");
 }
 else
 {
  if (front == rear)
  {
   front = rear = -1;
  }
  else if (front == max - 1)
  {
   front = 0;
  }
  else
  {
   front++;
  }
  printf("\nElement deleted Successfully");
 }
}

void display()
{
 int i;
 if (front == -1)
 {
  printf("\n\nSorry! Q is Empty");
 }
 else
 {
  printf("\n\n:: Queue Elements are ::\n");
  if (front <= rear)
  {
   for (i = front; i <= rear; i++)
   {
    printf("\n%d", q[i]);
   }
  }
  else
  {
   for (i = front; i < max; i++)
   {
    printf("\n%d", q[i]);
   }
   for (i = 0; i <= rear; i++)
   {
    printf("\n%d", q[i]);
   }
  }
 }
}
