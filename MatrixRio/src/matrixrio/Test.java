
package matrixrio;

import java.util.Arrays;
/**
 * 8/29/2015
 * @author Riorden D. Weber
 */
public final class Test // TEST - step 10
{   
    // All the matrix sets for different instances of a Matrix
    double[][] d1 = { { 1 }, { 4 } }; // 2D array matrix d1
    double[][] d2 = {  {1,4,9,8}, {1,4,9,8}, {1,4,9,8} };//2D array matrix d2
    double[][] d3 = { {2,5}, {-3,8}, {7,5} }; // 2D array matrix d3
    double[][] d4 = { {-3,10}, {2,8}, {9,0} }; // 2D array matrix d4
    
    double[][] d5 = { {5,5}, {5,3} }; // 2D array matrix d5
    double[][] d6 = { {1,2}, {3,4} }; // 2D array matrix d6
    
    double[][] d7 = { {5,8,5} }; // 2D array matrix d3
    double[][] d8 = { {1}, {2}, {3} }; // 2D array matrix d4
    
    double[][] d9 = { {1,2,3}, {3,2,1} }; // 2D array matrix d9
    double[][] d10 = { {2,5}, {-3,8}, {7,5} }; // 2D array matrix d10
    
    public Test()
    {
        // creates instances of matrix1, matrix2, matrix3, matrix4 and matrix5
  //Passes the matrix set to the MatrixCreatin class with the given matrix set
        MatrixCreation matrix1 = new MatrixCreation(d5); // matrix1
        MatrixCreation matrix2 = new MatrixCreation(d6); // matrix2
        
        MatrixCreation matrix3 = new MatrixCreation(d7); // matrix3
        MatrixCreation matrix4 = new MatrixCreation(d8); // matrix4
        
        MatrixCreation matrix5 = new MatrixCreation(d9); // matrix5
        MatrixCreation matrix6 = new MatrixCreation(d10); // matrix6
        
        // Show Matrix1
        System.out.printf("Matrix 1:");
        matrix1.displayMatrix();
        
        // Show Matrix2
        System.out.printf("Matrix 2:");
        matrix2.displayMatrix();
        
        //SET ENTRY - step 2
        System.out.printf("Test of setEntry for Matrix 2, "
                + "setting possition 0,1 to 2");
        matrix2.setEntry(0, 1, 2);
        matrix2.displayMatrix();

        //ADD - step 3
        System.out.printf("Matrix 1 + Matrix 2:");
        matrix1.add(matrix2).displayMatrix();

        //SUBTRACT - step 4
        System.out.printf("Matrix 1 - Matrix 2:");
        matrix1.subtract(matrix2).displayMatrix();
        
        //MULTIPLY - step 5
        System.out.printf("Matrix 1 * Matrix 2:");
        matrix1.multiplicar2(matrix2).displayMatrix();

        
        //EQUALS - step 6
        System.out.println(matrix1.equals(matrix2));

        //TRANSPOSE - step 7
        System.out.printf("Matrix 2 Transpose");
        matrix2.transpose().displayMatrix();
        
        System.out.printf("Matrix 3:");
        matrix3.displayMatrix();
        
        System.out.printf("Matrix 4:");
        matrix4.displayMatrix();
        
        System.out.printf("Matrix 3 * Matrix 4:");
        //System.out.println(multiplyByMatrix(d7, d8));
        matrix3.multiplicar2(matrix4).displayMatrix();
        
        System.out.printf("Matrix 5:");
        matrix5.displayMatrix();
        
        System.out.printf("Matrix 6:");
        matrix6.displayMatrix();
        
        System.out.printf("Matrix 5 * Matrix 6:");
        matrix5.multiplicar2(matrix6).displayMatrix();
        
        
        //ARRAY of MATRICES - step 11
        System.out.printf("Creation of Array of Matrixs\n");
        MatrixCreation[] array_of_matrices = {  matrix1, matrix2, matrix3, 
            matrix4, matrix5, matrix6 };
        //Arrays.sort(arr);
        System.out.printf(" current order: matrix1, matrix2, matrix3, "
                + "matrix4, matrix5, matrix6\n");
        
        System.out.println("Matrix Array Sorted Ascending");
        //ARRAY SORT - step 12
        Arrays.sort(array_of_matrices);
        //Arrays.sort(array_of_matrices, new MatrixCreation());
        for(int i = 0; i < array_of_matrices.length; i++)
        {
            array_of_matrices[i].displayMatrix();
        }
        
        System.out.println("Matrix Array Sorted Descending");
        Arrays.sort(array_of_matrices, matrix2);
        for(int i = 0; i < array_of_matrices.length; i++)
        {
            array_of_matrices[i].displayMatrix();
        }        
    } 
}
