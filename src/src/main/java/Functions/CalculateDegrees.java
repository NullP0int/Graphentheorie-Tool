package src.main.java.Functions;


/**
 * Created by NullP0int in October 2016.
 */

public class CalculateDegrees {

    public static class Degree{
        public int[] vertexDegrees;
        public int smallDelta;
        public int bigDelta;
    }

    /**
     * This method takes an adjacency matrix of a graph, calculates the degree of every vertex, its big and small delta
     * and returns a Degree-Object containing all this values.
     **/
    public Degree getDegreesFromAdjMatrix(int[][] adjMatrix) {

        if(adjMatrix == null) {
            return null;
        }

        Degree result = new Degree();
        result.vertexDegrees = new int[adjMatrix.length];
        result.smallDelta = adjMatrix.length;
        result.bigDelta = 0;

        for(int i = 0; i < adjMatrix.length; i++) {
            for(int j = 0; j < adjMatrix[i].length; j++) {

                // Fill the vertexDegrees with correct degrees
                if(adjMatrix[i][j] > 0) {

                    if(i == j) {
                        result.vertexDegrees[i] = result.vertexDegrees[i] + (2 * adjMatrix[i][j]);
                    } else {
                        result.vertexDegrees[i] = result.vertexDegrees[i] + adjMatrix[i][j];
                    }
                }
            }

            // Check for smallest (smallDelta)
            if(result.vertexDegrees[i] < result.smallDelta) {
                result.smallDelta = result.vertexDegrees[i];
            }

            // Check for bigger degree (bigDelta)
            if(result.vertexDegrees[i] > result.bigDelta) {
                result.bigDelta = result.vertexDegrees[i];
            }
        }

        //	Calculate and set the values of 'result' here
        return result;
    }

    /**
     * This method takes an adjacency list of a graph, calculates the degree of every vertex, its big and small delta
     * and returns a Degree-Object containing all this values.
     **/
    public Degree getDegreesFromAdjList(int[][] adjList) {

        if(adjList == null) {
            return null;
        }

        Degree result = new Degree();
        result.vertexDegrees = new int[adjList.length];
        result.smallDelta = adjList.length;
        result.bigDelta = 0;

        for(int i = 0; i < adjList.length; i++) {
            for(int j = 0; j < adjList[i].length; j++) {

                if(adjList[i][j] == i) {
                    result.vertexDegrees[i] = result.vertexDegrees[i] + 2;
                } else {
                    result.vertexDegrees[i]++;
                }
            }

            // Check for smallest (smallDelta)
            if(result.vertexDegrees[i] < result.smallDelta) {
                result.smallDelta = result.vertexDegrees[i];
            }

            // Check for bigger degree (bigDelta)
            if(result.vertexDegrees[i] > result.bigDelta) {
                result.bigDelta = result.vertexDegrees[i];
            }
        }

        //	Calculate and set the values of 'result' here
        return result;
    }

}
