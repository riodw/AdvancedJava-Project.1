/**
 * 1) Design a Matrix Class whose attributes include the number of rows, the number of columns and two dimensional array that is used to refer to the matrix.  The constructor of this class creates the required array and initializes every entry to 0.
 * 2) Write a setEntry method that takes two into parameters as the position of an entry and a double type parameter, and sets the given number to the position.
 * 3) Write an add method that adds this matrix (the matrix that calls/activates the method) and another matrix. If the dimensions of two matrices don't match, your method should throw a dimenstionMismatch exception.
 * 4) Write a subtract method that subtracts a matrix from this matrix. If the dimensions of two matrices don't match, your method should throw a dimenstionMismatch exception.\
 * 5) Write a multiply method that finds and returns the product of this matrix and another matrix if they have appropriate dimensions. If the dimensions of the matrices are not appropriate for multiplication, your method should throw a dimensionMismatch exception.
 * 6) Write an equals method that checks whether this matrix is equal to another matrix.
 * 7) The transpose of an n by m matrix is an m by n matrix whose value at the (i, j) position is the value at (j, i) of the original matrix. Define and implement a transpose method that finds the transpose of this matrix.
 * 8) The Arrays class has a static sort method of sorting arrays of objects in an ordering of the objects is defined. Let's make up an ordering for matrices: one matrix is less than another matrix if the sum of the absolute values of the entries of the first matrix is less than the sum of the absolute values of the entries of the second matrix. Your matrix class should implement the Comparable interface so that natural ordering is defined by our agreement above.
 * 9) You need to also implement the Comparator interface so that the opposite ordering of matrices is defined.
 * 10) Write a test class that tests the constructor and every method you have defined in the matrix class.
 * 11) Declare an array of matrices and fill it up with matrices. Use a sort method in the Arrays class to sort your array in ascending order.
 * 12) Use a sort method from the Arrays class to sort your matrix array in descending order.
 * 13) Design and implement a DimensionMismatch exception class and use it when two matrices don't have appropriate dimensions in the methods such as add, subtract and multiply.
 * 14) make sure that you use professional documentation (comments) so that javadoc can be applied.
 */
package matrixrio;

import java.util.ArrayList;
import java.util.Arrays;
/**
 * 8/29/2015
 * @author Riorden D. Weber
 */
public class MatrixRio {
    public static void main(String[] args)
    {
        System.out.println("Riorden Weber");
        // Make instance of Test which then makes instances of MatrixCreatin in 
        //its default constructor
        Test test_Constructor_Methods1 = new Test();       
    }  
}
