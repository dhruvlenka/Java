#include <stdio.h>
int main() 
{
    int x = 30;
    int y = 50;
    int temp = x;
    x = y;
    y = temp;
    printf("Value of X is = %d\n", y);
    printf("Value of Y is = %d\n", x);
    return 0;

}
