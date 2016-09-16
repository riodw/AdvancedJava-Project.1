package matrixrio;
/**
 * 8/29/2015
 * @author Riorden D. Weber
 */

import java.util.ArrayList;
import java.util.Comparator;

public class MatrixCreation implements Comparable<MatrixCreation>, 
        Comparator<MatrixCreation> 
        // COMPARABLE - (step 8) // COMPARATOR - (step 9)
{
    private int row = 0; //sets the variable row to the number of 0
    private int col = 0; //sets the variable col to the number of 0
    private double value; // creates value variable
    private final double [][] data; // creates the matrix array
     
    
    
    /**
     * 
     * @param r is the row length that the matrix will have
     * @param c is the col length that the matrix will have
     */
    public MatrixCreation(int r, int c) {
        this.row = r; // row is r
        this.col = c; // col is c
        data = new double[r][c];
    }
    
    // CONSTRUCTOR - (step 1)
    /**This is the constructor that creates an M-by-N matrix based on 2d array
     * This Matrix is auto created to have all values initialized to 0 
     * @param data as double[][]
     */
    public MatrixCreation(double[][] data)
    {
        row = data.length;//sets the variable row to the number of rows in the
                            //matrix that called the method in Test class
        col = data[0].length;
        this.data = new double[row][col];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
                    this.data[i][j] = data[i][j];
    }
    
    // DISPLAY
    /** The method displayMatrix, outputs the contents of a given matrix
     * No Parameters
     */
    public void displayMatrix()
    {
        //System.out.printf(" has " + row + " Rows, " + col + " Columns");
        // Prints the number of Columns
        System.out.printf("\n\tColumn:\n|\t");
        for (int j = 0; j < col; j++)
                System.out.printf("   (" + "%d" + ") ",j); // prints out the 
                                    //numbr of cloumns for easy reading
        // for loops step through the matrix
        for (int i = 0; i < row; i++)
        {
            System.out.printf("\nRow %d: ", i);
            for (int j = 0; j < col; j++)
                System.out.printf("%7.1f",data[i][j]); // prints out the value
                                                    //of matrix location i, j
        }
        System.out.println("\n"); // print line at end for easy reading
    }
    
    // SETENTRY - (step 2)
    /**
     *The setEntry method, setting the entry at a specific location on a given
     * matrix
     * @param row2set as int to row
     * @param col2set as int to col
     * @param value as double to set value at row and col
     */
    public void setEntry(int row2set, int col2set, double value)
    {
        data[row2set][col2set] = value;//setting the value of the matrix that
        //called the metho0d at the two passes parameters to the passed value
    }
    
    // ADD - (step 3)
    // return C = A + B
    /**
     * The add method, adding two matrix together
     * @param matrix2 a MatrixCreation as Matrix
     * @return the result of Matrix that called this method plus another Matrix
     * as matrix3
     */
    public MatrixCreation add(MatrixCreation matrix2)
    {
        MatrixCreation matrix1 = this;
        // check if the matrixs are the same size
        if (matrix2.row != matrix1.row || matrix2.col != matrix1.col)
            throw new DimensionMismatchException("Illegal matrix dimensions.");
            // if not same size through an exception with the exceptions class
        
        // creating new matrix to put the output in
        MatrixCreation matrix3 = new MatrixCreation(data);
        double result; // variable that is used to hold the value of what is in
// matrix that called the function while the for loop steps through the matrix
        // for loops step through the matrix
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
            {
                result = matrix1.data[i][j] + matrix2.data[i][j];
                // sets value of matrix2 at j, i to result
                matrix3.setEntry(i, j, result);
            }
        return matrix3; // return the result of matrix1 + matrix2 as matrix3
    }
    
    // SUBTRACT - (step 4)
    /**
     * The subtract method, subtracting two matrix
     * @param matrix2  a MatrixCreation as Matrix
     * @return matrix3
     */
    public MatrixCreation subtract(MatrixCreation matrix2)
    {
        MatrixCreation matrix1 = this;
        // check if the matrixs are the same size
        if (matrix2.row != matrix1.row || matrix2.col != matrix1.col)
            throw new DimensionMismatchException("Illegal matrix dimensions.");
            // if not same size through an exception with the exceptions class
        // create a new matrix to output in
        MatrixCreation matrix3 = new MatrixCreation(data); 
        double end;//variable that is used to hold the value of what is in the
 //matrix that called the function while the for loop steps through the matrix
        // for loops step through the matrix
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
            {
                end = matrix1.data[i][j] - matrix2.data[i][j];
                // sets value of matrix2 at j, i to end
                matrix3.setEntry(i, j, end); 
            }
        return matrix3; // return the result of matrix1 + matrix2 as matrix3
    }
    
    // EQUALS - (step 6)
    /** The equals method, checks if two matrix are equal to one another
     * @param matrix2 a MatrixCreation as Matrix
     * @return True or False by if "this" = matrix2
     */
    public boolean equals(MatrixCreation matrix2)
    {
        MatrixCreation matrix1 = this;//making this keyword equal to the matrix
        // check if the matrixs are the same size
        if (matrix2.row != matrix1.row || matrix2.col != matrix1.col)
            throw new RuntimeException("Illegal matrix dimensions.");
                // if not same size throught an exception
        // for loops step through the matrix
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
            {
                if(matrix1.data[i][j] != matrix2.data[i][j])
                    return false; // return FLASE if all values of matrix1 are 
                //NOT equal to the values of matrix2
            }
        return true;
      //return true if all values of matrix1 are equal to the values of matrix2
    }
    
    // TRANSPOSE - (step 7)
    /** The transpose method, reversing the order of a matrix (the amount of
     * row becomes columns and the columns become the rows
     * @return matrix2
     */
    public MatrixCreation transpose()
    {
        double[][] transposeMatrix = new double[col][row];
        
        MatrixCreation matrix2 = new MatrixCreation(transposeMatrix);
        double end; // variable that is used to hold the value the matrix
       
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
            {
                end = this.data[i][j]; // sets the value of i, j to end
                matrix2.setEntry(j, i, end);//sets matrix data set of matrix2
            }
        return matrix2;
    }

    /**
     * 
     * @param matrix1 the first matrix
     * @param matrix2 the second matrix for the caparison between each of them
     * @return 1 if less, -1 if greater, 0 if equal
     */
    @Override
    public int compare(MatrixCreation matrix1, MatrixCreation matrix2)
    {
        double firstMatrix = matrix1.absoluteValue();
        double secondMatrix = matrix2.absoluteValue();
        
        if(firstMatrix < secondMatrix)
            return 1;
        else if(firstMatrix > secondMatrix)
            return -1;
        else
            return 0;
    }
    
    // SORT - (step 8)
    /**
     * 
     * @param matrix2 this is getting compared to the matrix that called the
     * function for value
     * @return -1 if less, 1 if greater, 0 if equal
     */
    @Override
    public int compareTo(MatrixCreation matrix2)
    {
        MatrixCreation matrix1 = this;
        double firstMatrix = matrix1.absoluteValue();
        double secondMatrix = matrix2.absoluteValue();
        
        if(firstMatrix < secondMatrix)
            return -1;
        else if(firstMatrix > secondMatrix)
            return 1;
        else
            return 0;       
    }
    
    /**
     * 
     * @return total
     */
    public double absoluteValue()
    {
        double total = 0;
        double negativeSwitch;
                
        for (int i = 0; i < row; i++)
            for (int j = 0; j < col; j++)
            {
                negativeSwitch = this.data[i][j];
                if(negativeSwitch < 0)
                {
                    negativeSwitch = negativeSwitch * -1;
                }
                total += negativeSwitch; // sets the value of i, j to end
            }
        return total;
    }
    
    /**
     * 
     * @param matrix2 this is matrix that is being multiplied with the matrix 
     * that called the function
     * @return matrix3 as matrix of matrix1 * matrix2
     */
    public MatrixCreation multiplicar2(MatrixCreation matrix2) {
        MatrixCreation matrix1 = this;
         //matrix1ColLength columns
        int matrix1ColLength = matrix1.data[0].length;
        int matrix2RowLength = matrix2.data.length;//rows length
        if(matrix1ColLength != matrix2RowLength)
            throw new RuntimeException("Illegal matrix dimensions.");
         // if not same size throught an exception
        
        int matrixRRowLength = matrix1.data.length;    // m result rows length
        int matrixRColLength = matrix2.data[0].length;//m result columns length
        
        MatrixCreation matrix3 = new MatrixCreation(matrixRRowLength, 
                matrixRColLength);
        // for loop solving the multiply of two matrix
        for(int i = 0; i < matrixRRowLength; i++) {       // rows from matrix1
            for(int j = 0; j < matrixRColLength; j++) { // columns from matrix2
                for(int k = 0; k < matrix1ColLength; k++) {//col from matrix1
                    matrix3.data[i][j] += matrix1.data[i][k] * 
                            matrix2.data[k][j];
                   // matrix3.setEntry(i, j, end);
                }
            }
        }
        return matrix3; // returning the matrix3
    }
}
    


