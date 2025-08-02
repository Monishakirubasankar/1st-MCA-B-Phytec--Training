#include <stdio.h>

int square(int a) {
    return a * a;
}

void display(int value) {
    printf("Area of square : %d\n", value);
}

int main() {
    int a= 7;
    printf("Area of square\n");
    printf("**************\n");
    int r= square(a);
    display(r);
    return 0;
}

