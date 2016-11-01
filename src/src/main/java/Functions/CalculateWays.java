package src.main.java.Functions;

import src.main.java.Exceptions.MultiplyMatrixException;

/**
 * Created by NullP0int in October 2016.
 */

public class CalculateWays extends AbstractToString {

    // Calculates the maximal ways with the given length
    public int[][] calcWaysToMatrix(int[][] matrix, int maxlength) {

        CalculateMatrix calcMatrix = new CalculateMatrix();
        int[][] result = matrix;

        try {
            for(int i = 1; i < maxlength; i++) {
                result = (calcMatrix.multiplyMatrix(result, matrix));
            }
        } catch (MultiplyMatrixException e) {
            e.printStackTrace();
        }

        return result;
    }
    // end calculate ways

    // calculates the maximal ways and return it as string
    public String calcWaysToMatrixToString(int[][] matrix, int maxlength) throws MultiplyMatrixException {
        int[][] result = calcWaysToMatrix(matrix, maxlength);
        return super.MatrixToString(result);
    }
}
