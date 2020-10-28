//Program to find the upper and lower triangle of a matrix

#include <stdio.h>


void display(int mat[100][100],int r,int c);
void upper_triangle(int mat[100][100],int r,int c);
void lower_triangle(int mat[100][100],int r,int c);

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
	printf("The upper triangle is: \n");
	upper_triangle(mat,r,c);
	printf("The lower triangle is: \n");
	lower_triangle(mat,r,c);
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

//Displaying the upper matrix
void upper_triangle(int mat[100][100],int r,int c){
	int i,j;
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			if(i<j)
				printf("%d ",mat[i][j]);
			else
				printf("* ");
		}
		printf("\n");
	}
}

//Displaying the lower matrix
void lower_triangle(int mat[100][100],int r,int c){
	int i,j;
	for(i=0;i<r;i++){
		for(j=0;j<c;j++){
			if(i>j)
				printf("%d ",mat[i][j]);
			else
				printf("* ");
		}
		printf("\n");
	}
}