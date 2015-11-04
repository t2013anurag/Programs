#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
	int t;
	cin>>t;
	while(t-->0)
	{
    string str;
    cin>>str;
    int l=str.length();
    if(l%2==0)
    {
    int A[26],B[26],i;
    for(i=0 ; i< 26 ; i++)
        A[i] = B[i] = 0;
    for(i = 0 ; i< l/2 ; i++)
        A[(int)(str[i] - 'a')]++;
    for(i = l/2 ; i< l ; i++)
        B[(int)(str[i] - 'a')]++;
    int outp = 0;
    for(i=0 ; i< 26 ; i++)
        outp = outp + A[i] + B[i] - 2*min(A[i],B[i]);
    cout<<outp/2<<endl;
	}
	else
	cout<<-1<<endl;
}
    system("pause");
    return 0;
}
