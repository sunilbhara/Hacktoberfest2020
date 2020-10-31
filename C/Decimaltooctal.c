#include <stdio.h>

//Program to convert a given decimal number to octal and to display it

int main()
{
    int in, d1, d2, d3, d4, d5;

    printf("Enter a number between 0 and 32767: ");
    scanf("%d", &in);

    d5 = in % 8;
    in /= 8;
    
    d4 = in % 8;
    in /= 8;

    d3 = in % 8;
    in /= 8;

    d2 = in % 8;
    in /= 8;

    d1 = in % 8;
    in /= 8;

    printf("In octal, your number is: %d%d%d%d%d\n", d1, d2, d3, d4, d5);

    return 0;
}
