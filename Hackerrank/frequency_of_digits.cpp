#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include<stdlib.h>
using namespace std;
int main()
 {
   int a[13]={1,2,3,5,2,3,1,5,3,1,2,3,4};
   int i;
   int c[100]={0};

   for(i = 0 ; i < 10 ; i++)
       c[a[i]]++;

   for(i=0;i<10;i++)
      cout<<i<<": "<<c[i]<<endl;
system("pause");
   return 0;
 }
