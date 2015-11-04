
#include<iostream>
using namespace std;

int main(void)
{
	int array[5];		// An array of integers.
	int length = 5;		// Length of the array.
	int i, d;
	int tmp, flag;

	//Some input
	for (i = 0; i < length; i++)
	{
		cout << "Enter a number: ";
		cin >> array[i];
	}

	//Algorithm
	d = length;
	flag = 1;
	while ( flag || (d > 1))
	{
		flag = 0;
		d = (d + 1)/2;
		for (i =0; i < (length - d); i++)
		{
			if (array[i + d] > array[i])
			{
				tmp = array[i+d];
				array[i + d] = array[i];
				array[i] = tmp;
				flag = 0;
			}
		}
	}

	//Some output
	for (i = 0; i < 5; i++)
	{
		cout << array[i] << endl;
	}
}
