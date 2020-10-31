#include<stdio.h>
main(){
	int L,i, aux=0, ant1=0, ant2=1,cont;
	scanf("%d",&L);
	do{
		for(i=1;i<=L;i++){
			printf("%d\t",ant2);
			aux= ant1;
			ant1= ant2;
			ant2= aux + ant1;		
		}
		printf("\ndigite 1 para continuar\n");
		scanf("%d",&cont);
	}while(cont==1);
}
