#define SIZE 400
#include <ctype.h>
#include<stdio.h>
#include<stdlib.h>
char s[SIZE];
int top = -1; 
void push(char elem)
{ 
 s[++top] = elem;
}
char pop()
{ 
 return (s[top--]);
}

int pr(char elem)
{ 
 switch (elem)
 {
 case '#':
  return 0;
 case '(':
  return 1;
 case '+':
 case '-':
  return 2;
 case '*':
 case '/':
  return 3;
  case '^':
  return 4;
  default:
		exit(0);
 }
}

int main()
{ 
int t,j;
scanf("%d",&t);
for(j=0;j<t;j++)
{
char infx[400]; char pofx[400]; char ch;
 int i = 0, k = 0;
  scanf("%s", infx);
 push('#');
 while ((ch = infx[i++]) != '\0') {
  if (ch == '(')
   push(ch);
  else if (isalnum(ch))
   pofx[k++] = ch;
  else if (ch == ')') {
   while (s[top] != '(')
    pofx[k++] = pop();
  pop();
  } else {
   while (pr(s[top]) >= pr(ch))
    pofx[k++] = pop();
   push(ch);
  }
 }
 while (s[top] != '#')
  pofx[k++] = pop();
 pofx[k] = '\0';
 printf("%s\n", pofx);
}
system("pause");
return 0;
}


