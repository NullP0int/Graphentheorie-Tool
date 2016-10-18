package src.main.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NullP0int in October 2016.
 */

public class Converter {

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

    // Converts the adjMatrix[][] to String
    public String MatrixToString(int[][] adjMatrix) {
        return AllToString(adjMatrix);
    }

    public String adjListToString(int[][] adjList) {
        return AllToString(adjList);
    }

    // Converts an adjMatrix or adjList to String
    public String AllToString(int[][] List) {

        String ListString = "";
        String line;

        for(int i = 0; i < List.length; i++) {

            line = "";

            for(int j = 0; j < List[i].length; j++) {
                line = line + Integer.toString(List[i][j]) + ",";
            }

            if (i == (List.length - 1) ) {
                ListString = ListString + ("{" + line.substring(0, line.length()-1)  + "}\n" );
            } else {
                ListString = ListString + ("{" + line.substring(0, line.length()-1)  + "}" + ",\n");
            }
        }
        return ListString;
    }

    // Converts the List<ArrayList> to String
    public String ListToString(List<ArrayList> BasicList) {

        String retListString = "";
        String ListString;

        for(int i = 0; i < BasicList.size(); i++) {

            List<Integer> adjList = BasicList.get(i);
            ListString = "" ;

            for(int j = 0; j < adjList.size(); j++) {
                // fill the String with listitems
                ListString = ListString + adjList.get(j) + ",";
            }

            if (i == (BasicList.size() - 1) ) {
                // if this is the last list
                retListString = retListString + ( "/* " + i + " */ " + "{" + ListString.substring(0, ListString.length()-1)  + "}\n");
            } else {
                // if not ...
                retListString = retListString + ( "/* " + i + " */ " + "{" + ListString.substring(0, ListString.length()-1)  + "}" + ",\n");
            }
        }
        return retListString;
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

}