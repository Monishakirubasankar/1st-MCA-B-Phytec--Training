#include <stdio.h>
void add(int a,int b);
int main() {
    add(5, 3);  
    return 0;
}
void add(int a,int b)
{
	int c;
	c=a+b;
	printf("Addition %d \n",c);
}
