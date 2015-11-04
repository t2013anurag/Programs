#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include<string>
#include <algorithm>
#include<stdlib.h>
using namespace std;
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int t;
    char s[100];
    cin>>t;
    while(t--)
	{
        cin>>s;
        int i=0;
        while(s[i]!='\0')
		   i++;
		      if(next_permutation(s,s+i))
			  {
				for(int j=0;j<i;j++)
					cout<<s[j];
					cout<<endl;
    		  }
			  else
				cout<<"no answer"<<endl;
	}
    system("pause");
    return 0;
}
