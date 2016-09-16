
package matrixrio;

/**
 * 8/29/2015
 * @author Riorden D. Weber
 */
public class DimensionMismatchException extends RuntimeException
{
    /**
     * // DimensionMismatchException - (step 13)
     * @param message the message to the supper from the error
     */
    public DimensionMismatchException(String message)
    {
        super(message); // passes the message to the supper constructor 
        //RuntimeException
    }
    
    public DimensionMismatchException(){};//other default constructor-No param
}
