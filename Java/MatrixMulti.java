public class MatrixMulti {
	
	static Scanner ip = new Scanner(System.in);
	
	//matrix insertion
	static void insert_matrix(int mat[][],int row, int col){
		System.out.println("Enter elements of the matrix ");
		for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) 
                mat[i][j] = ip.nextInt(); 
        } 
	}
	
	//printing matrix
	static void print_matrix(int mat[][], int row, int col) {
		for (int i = 0; i < row; i++) { 
            for (int j = 0; j < col; j++) 
                System.out.print(mat[i][j] + " "); 
  
            System.out.println(); 
        } 
	}
	
	//matrix multiplication
	static void mat_multiply(int mat1[][], int mat2[][], int row1, int row2, int col1, int col2) {
		
		if (row2 != col1) {   
            System.out.println("Multiplication Not Possible"); 
        } 
		else {
			int i,j,k;
		    int mat3[][] = new int[row1][col2]; 
		   
	        for (i = 0; i < row1; i++) { 
	            for (j = 0; j < col2; j++) { 
	                for (k = 0; k < row2; k++) 
	                    mat3[i][j] += mat1[i][k] * mat2[k][j]; 
	            } 
	        } 
	        System.out.println("Resultant Matrix:"); 
	        print_matrix(mat3, row1, col2); 
	    }
	}

	public static void main(String[] args) {
		System.out.print("Enter number of rows for matrix one ");
		int row1 = ip.nextInt();
		System.out.print("Enter number of columns for matrix one ");
		int col1 = ip.nextInt();
		int mat1[][] = new int[row1][col1];
		insert_matrix(mat1,row1,col1);
		
		System.out.print("Enter number of rows for matrix two ");
		int row2 = ip.nextInt();
		System.out.print("Enter number of columns for matrix two ");
		int col2 = ip.nextInt();
		int mat2[][] = new int[row2][col2];
		insert_matrix(mat2,row2,col2);
		
		System.out.println("Matirx 1 is ");
		print_matrix(mat1,row1,col1);
		System.out.println("Matrix 2 is ");
		print_matrix(mat2,row2,col2);
		
		mat_multiply(mat1,mat2,row1,row2,col1,col2);
		
	}

}
