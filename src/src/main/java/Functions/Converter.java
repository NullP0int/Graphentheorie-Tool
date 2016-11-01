package src.main.java.Functions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NullP0int in October 2016.
 */

public class Converter extends AbstractToString {

    private int[][] Matrix;

    public Converter() {

    }

    // Converts the adjMatrix[][] to List<ArrayList>
    public List<ArrayList> MatrixToList(int[][] adjMatrix) {

        List<ArrayList> BasicAdjList = new ArrayList();

        for(int i = 0; i < adjMatrix.length; i++){
            BasicAdjList.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < adjMatrix.length; i++) {

            for(int j = 0; j < adjMatrix[i].length; j++) {

                if( adjMatrix[i][j] == 1 ) {
                    BasicAdjList.get(i).add(j);
                }
            }
        }
        return BasicAdjList;
    }

    // Converts the List<ArrayList> to Matrix[][]
    public int[][] ListToMatrix(List<ArrayList> BasicList) {

        // for a better performance
        int BasicListSize = BasicList.size();
        int count;
        Matrix = new int[BasicListSize][BasicListSize];

        for(int i = 0; i < BasicListSize; i++) {

            List<Integer> adjList = BasicList.get(i);
            count = 0;

            // fill the Matrix with listitems
            for (int j = 0; j < adjList.size(); j++) {

                int value = adjList.get(j);

                while (count < value) {
                    Matrix[i][count] = 0;
                    count++;
                }
                if (value == count) {
                    Matrix[i][count] = 1;
                    count++;
                }
            }
        }
        return Matrix;
    }

    // Converts the adjList[][] to Matrix[][]
    public int[][] adjListToMatrix(int[][] adjList) {

        // for a better performance
        int MatrixSize = adjList.length;
        int count;
        Matrix = new int[MatrixSize][MatrixSize];

        for(int i = 0; i < MatrixSize; i++) {

            //List<Integer> adjList = BasicList.get(i);
            count = 0;

            // fill the Matrix with listitems
            for (int j = 0; j < adjList[i].length; j++) {

                int value = adjList[i][j];

                while (count < value) {
                    Matrix[i][count] = 0;
                    count++;
                }
                if (value == count) {
                    Matrix[i][count] = 1;
                    count++;
                }
            }
        }
        return Matrix;
    }

    // Converts the List<ArrayList> to String
    public String ListToString(List<ArrayList> BasicList) {
        return super.ListToString(BasicList);
    }

    // Converts the adjMatrix[][] to List<ArrayList>
    public List<ArrayList> adjListToList(int[][] MatrixList) {

        List<ArrayList> BasicAdjList = new ArrayList();
        List tmpList;

        for(int i = 0; i < MatrixList.length; i++){
            BasicAdjList.add(new ArrayList<Integer>());
        }

        for(int i = 0; i < MatrixList.length; i++) {

            tmpList = BasicAdjList.get(i);

            for(int j = 0; j < MatrixList[i].length; j++) {
                tmpList.add(MatrixList[i][j]);
            }
        }

        return BasicAdjList;
    }

    // Converts the adjMatrix[][] to String
    public String MatrixToString(int[][] adjMatrix) {
        return AllToString(adjMatrix);
    }

    public String adjListToString(int[][] adjList) {
        return AllToString(adjList);
    }

    // Converts an adjMatrix or adjList to String
    public String AllToString(int[][] List) {
        return super.AllToString(List);
    }

}