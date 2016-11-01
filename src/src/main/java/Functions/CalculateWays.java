package src.main.java.Functions;

import src.main.java.Exceptions.AddMatrixException;
import src.main.java.Exceptions.MultiplyMatrixException;

/**
 * Created by NullP0int in October 2016.
 */

public class CalculateWays extends AbstractToString {

    CalculateMatrix calcMatrix = new CalculateMatrix();

    // Calculates the maximal ways with the given length
    public int[][] calcWaysToMatrix(int[][] matrix, int maxlength) throws AddMatrixException {

        int[][] result = matrix;

        if(maxlength > 1) {
            for(int i = 2; i <= maxlength; i++) {
                result = calcMatrix.addMatrix(result, calcMatrix.matrixHochX(matrix, i));
            }
        }

        return result;
    }
    // end calculate ways

    // calculates the maximal ways and return it as string
    public String calcWaysToMatrixToString(int[][] matrix, int maxlength) throws MultiplyMatrixException, AddMatrixException {
        int[][] result = calcWaysToMatrix(matrix, maxlength);
        return super.MatrixToString(result);
    }
}
