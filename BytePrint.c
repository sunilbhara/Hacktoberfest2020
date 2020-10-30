#include <stdio.h> 

main()
{
int b=1934;int c,d,e;
c=b&0xf0;
c=c>>4;
d=b&0xf00;
d=d>>8;
 printf("  2nd byte %d\n",c);
 printf("3rd byte %d\n",d);

    return 0;
}
