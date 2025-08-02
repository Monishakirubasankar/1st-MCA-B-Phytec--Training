#include<stdio.h>
int main()
{
	int arr[]={1,2,3,4,5};
	int c=sizeof(arr)/sizeof(arr[0]);
	for(int i=0;i<c;i++)
	{
	printf("Array:%d\n",arr[i]);
	}
	return 0;

}


