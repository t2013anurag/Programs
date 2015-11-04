#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <climits>
using namespace std;

int main()
{
    long long int i,n,k,minimum=999999999,temp;
    cin >> n >> k;
    long long int a[n];
for(i=0;i<n;i++)
cin >> b[i];
printf("%d\n%d",a,a+n);
sort(b,b+n);
for(i=0;i<=n-k;i++)
{
temp = b[i+k-1]-b[i];
if(temp < min)
minimum = temp;
}
cout << mininimum << endl;
system("pause");
return 0;
}
