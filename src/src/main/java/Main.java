package src.main.java;

import src.main.java.Deliveries.Example_Delivery_U1A1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NullP0int in October 2016.
 */

public class Main {

    public static void main(String[] args) {

        Converter convert = new Converter();
        Example_Delivery_U1A1 exampleDelivery_U1A_1 = new Example_Delivery_U1A1();
        CalculateDegrees calcDegree = new CalculateDegrees();
        CalculateDegrees.Degree degree;

        System.out.println("MatrixA (adjMatrixA)");
        System.out.println(convert.MatrixToString(exampleDelivery_U1A_1.adjMatrixA));
        List<ArrayList> adjList = convert.MatrixToList(exampleDelivery_U1A_1.adjMatrixA);
        System.out.println("ListA (adjListeA)");
        System.out.println(convert.ListToString(adjList));


        System.out.println("ListB (adjListeB)");
        List<ArrayList> adjListB = (convert.adjListToList(exampleDelivery_U1A_1.adjListeB));
        System.out.println(convert.ListToString(adjListB));
        int[][] MatrixB = convert.ListToMatrix(adjListB);
        System.out.println("MatrixB (adjMatrixB)");
        System.out.println(convert.MatrixToString(MatrixB));


        System.out.println("All degrees from adjMatrixA");
        degree = calcDegree.getDegreesFromAdjMatrix(exampleDelivery_U1A_1.adjMatrixA);

        for (int i = 0; i < degree.vertexDegrees.length; i++) {
            System.out.println("Vertex: " + i + ", Degree = " + degree.vertexDegrees[i]);
        }

        System.out.println("smallDelta: " + degree.smallDelta);
        System.out.println("bigDelta " + degree.bigDelta + "\n");


        System.out.println("All degrees from adjListeB");
        degree = calcDegree.getDegreesFromAdjList(exampleDelivery_U1A_1.adjListeB);

        for (int i = 0; i < degree.vertexDegrees.length; i++) {
            System.out.println("Vertex: " + i + ", Degree = " + degree.vertexDegrees[i]);
        }

        System.out.println("smallDelta: " + degree.smallDelta);
        System.out.println("bigDelta " + degree.bigDelta);
    }
}
