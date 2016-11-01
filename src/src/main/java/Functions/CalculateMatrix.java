package src.main.java.Functions;

import src.main.java.Exceptions.AddMatrixException;
import src.main.java.Exceptions.MultiplyMatrixException;

/**
 * Created by NullP0int in October 2016.
 */

public class CalculateMatrix extends AbstractToString {

    // ********** add matrixes **********
    public int[][] addMatrix(int[][] a, int[][] b) throws AddMatrixException {

        // check if length is correct
        if(a.length != b.length) {
            throw new AddMatrixException("Length incorrect: Matrix a length = " + a.length + " , b length = " + b.length);
        }

        int[][] result = new int[a.length][b.length];

        for(int i = 0; i < a.length; i++) {

            // check if length is correct
            if(a[i].length != b[i].length) {
                throw new AddMatrixException("Length incorrect: Matrix a[" + i + "] length = " + a[i].length + " , b[" + i + "] length = " + b[i].length);
            }

            for(int j = 0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }
    // ********** end add matrixes **********

    // add the given Matrix and print the result-matrix
    public String addMatrixToString(int[][] a, int[][] b) throws AddMatrixException {
        int[][] result = addMatrix(a, b);
        return super.MatrixToString(result);
    }

    // ********** multiply matrixes **********
    public int[][] multiplyMatrix(int[][] a, int[][] b) throws MultiplyMatrixException {

        int[][] result;

        // if matrices sized equal
        if (a[0].length == b.length) {

            int aLength = a.length;
            int aCols = a[0].length;
            int bCols = b[0].length;

            result = new int[aLength][bCols];

            for (int i = 0; i < aLength; i++) {
                for (int j = 0; j < bCols; j++) {

                    result[i][j] = 0;

                    for (int k = 0; k < aCols; k++) {
                        result[i][j] = result[i][j] + (a[i][k] * b[k][j]);
                    }
                }
            }
        } else {
            throw new MultiplyMatrixException("Wrong matrix format!");
        }

        return result;
    }

    // add the given Matrix and print the result-matrix
    public String multiplyMatrixToString(int[][] a, int[][] b) throws MultiplyMatrixException {
        int[][] result = multiplyMatrix(a, b);
        return super.MatrixToString(result);
    }
    // ********** end multiply matrixes **********

}
