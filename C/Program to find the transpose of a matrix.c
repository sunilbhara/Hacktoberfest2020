//Program to find the tranpose of a matrix

#include <stdio.h>


void display(int mat[100][100],int r,int c);
void transpose(int mat[100][100],int r,int c);
int tranpose[100][100];

int main(){
	int mat[100][100],i,j,r,c;
	printf("Enter the number of rows and columns in the matrix: ");
	scanf("%d %d",&r,&c);
	printf("Enter the values for the matrix: ");
	for(i=0;i<r;i++)
		for(j=0;j<c;j++)
			scanf("%d",&mat[i][j]);
	printf("The original matrix is: \n");
	display(mat,r,c);
	printf("\n*** Transposing the matrix ***\n");
	
	printf("The transposed matrix is: \n");
	transpose(mat,r,c);
	display(tranpose,r,c);
}

//Displaying the matrix
void display(int mat[100][100],int r,int c){
	int i,j;
	for(i=0;i<r;i++){
		for(j=0;j<c;j++)
			printf("%d ",mat[i][j]);
		printf("\n");
	}
}

//Forming the transpose matrix
void transpose(int mat[100][100],int r,int c){
	int i,j;
	for(i=0;i<r;i++)
		for(j=0;j<c;j++)
			tranpose[j][i]=mat[i][j];
}