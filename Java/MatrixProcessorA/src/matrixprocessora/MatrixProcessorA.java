/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixprocessora;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Ali
 */
public class MatrixProcessorA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner s1=new Scanner(System.in);
        String filename="matrixA.txt";
        
        System.out.println("Please provide a filename as an argument!");
        String f=s1.next();
        
        
        int i,j,rows,cols;
        int A[][] =new int[4][4];
        
        
        if(f.equals(filename)){
            
            Scanner sc = new Scanner(new BufferedReader(new FileReader("matrixA.txt")));

      while(sc.hasNextLine()) {
         for (i=0; i<A.length; i++) {
            String[] line = sc.nextLine().trim().split(" ");
            for (j=0; j<line.length&&j<A.length; j++) {
               A[i][j] = Integer.parseInt(line[j]);
            }
         }
      }

        System.out.println("Orignal Array ");
        for(i=0;i<A.length;i++){
            
            for(j=0;j<3;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
            
            
        }
        else{
            System.out.println("Invalid Input");
        }
        
    }
    
}
