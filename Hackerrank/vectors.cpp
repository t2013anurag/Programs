#include<iostream>

#include<vector>
#include<stdlib.h>
using namespace std;
int main()
{
	vector<int> myVector;
	myVector.push_back(4);
	myVector.push_back(5);
	myVector.push_back(67);
	myVector.push_back(89);
	myVector.push_back(22);
	for(unsigned int i=0;i<myVector.size();i++)
	cout<<myVector[i]<<" ";
	
	// Insert before the specified index number
	myVector.insert(myVector.begin()+4,3);
	cout<<endl<<"New Line\n";
	for(unsigned int i=0;i<myVector.size();i++)
	cout<<myVector[i]<<" ";
	cout<<endl;

	//Returns 1 if the vector is empty else 0
	cout<<myVector.empty();
    cout<<endl;

	//Delete before the specified index number
    myVector.erase(myVector.begin()+5);
	cout<<endl<<"New Line\n";
	for(unsigned int i=0;i<myVector.size();i++)
	cout<<myVector[i]<<" ";
	
	//Delete all the elements of the vectors
	myVector.clear();
	cout<<endl<<"New Line\n";
	for(unsigned int i=0;i<myVector.size();i++)
	cout<<myVector[i]<<" ";
	
	//Returns 1 if the vector is empty else 0
	cout<<myVector.empty();
	cout<<endl;

	system("pause");
	return 0;
}
