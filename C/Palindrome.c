#include <stdio.h>
int main() {
    int n, revnum = 0, rem, num;
    char choice;
    do{
        printf("Enter an integer: ");
        scanf("%d", &n);
        num = n;

        while (n != 0) {
            rem = n % 10;
            revnum = revnum* 10 + rem;
            n =n/ 10;
        }

        if (num == revnum)
            printf("%d is a palindrome number.", num);
        else
            printf("%d is not a palindrome number.", num);

        printf("\nDo you want to continue(Y/N)?" );
        fflush(stdin);
        scanf("%c",&choice);
        }
    while(choice=='Y'||choice=='y');


    return 0;
}
