#include <iostream>

using namespace std;
void display(string);

int main()
{
	string name;
	cout << "Enter a name : ";
	cin >> name;
	display(name);
}
void display(string s)
{
	cout << s;
}
