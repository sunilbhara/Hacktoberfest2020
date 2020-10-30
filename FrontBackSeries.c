#include<stdio.h>
int main()
{
	int a,b=1;
	printf("Enter no=");
	scanf("%d",&a);
	
	while(a>=b)
	{
		if(a!=b)
		{
		printf("%d,",b);
		b++;
	}
			printf("%d,",a);
			a--;
	}
	return 0;
}
