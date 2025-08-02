#include<stdio.h>
int regression(int n);
 int main()
{	
  int n=5;
  int r=regression(n);
  printf("factorial %d:%d\n",n,r);
  return 0;
}
int regression(int n)
{
	if(n==0||n==1)
	{
	  return 1;

        }
        else {
	return n*regression(n-1);
	
        }
}
