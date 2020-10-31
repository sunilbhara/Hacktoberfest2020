#include <iostream>
using namespace std;

template <class T>

void search(T a[],int n,T key)
{
  int flag=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]==key)
    {
      cout<<"The element is present in the array. \n";
      flag++;
      break;
    }

    else
    {
      i++;
    }
  }
if(flag == 0)
{
  cout<<"The element is not present in the array. \n";
}
}


int main()
{
 int n1,i,key1,n2,n3;
 cout<<"\n\nFOR THE INTEGER ARRAY : \n\n";
cout<<"Enter the size of the array : \t";
cin>>n1;
int arr1[n1];
cout<<"Enter the "<<n1<<" elements of the array : \t";
for(i=0;i<n1;i++)
{
  cin>>arr1[i];
}
cout<<"\nEnter the key element to be searched : \t";
cin>>key1;

 search<int>(arr1,n1,key1);

 char key2;
 cout<<"FOR THE CHARACTER ARRAY : \n\n";
cout<<"Enter the size of the array : \t";
cin>>n2;
char arr2[n1];
cout<<"Enter the "<<n2<<" elements of the array : \t";
for(i=0;i<n2;i++)
{
  cin>>arr2[i];
}
cout<<"\nEnter the key element to be searched : \t";
cin>>key2;

 search<char>(arr2,n2,key2);

 double key3;
 cout<<"\n\nFOR THE DOUBLE ARRAY : \n\n";
cout<<"Enter the size of the array : \t";
cin>>n3;
double arr3[n3];
cout<<"Enter the "<<n3<<" elements of the array : \t";
for(i=0;i<n3;i++)
{
  cin>>arr3[i];
}
cout<<"\nEnter the key element to be searched : \t";
cin>>key3;

 search<double>(arr3,n3,key3);
  return 0;
}
