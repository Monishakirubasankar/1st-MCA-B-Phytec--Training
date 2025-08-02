#include<stdio.h>
int main()
{
	int sum=0;
	int arr[]={1,2,3,4,5};
	int c=sizeof(arr)/sizeof(arr[0]);
	for(int i=0;i<c;i++)
	{ 
		sum=sum+arr[i];
	}
		printf("array:%d\n",sum);
		return 0;
}
