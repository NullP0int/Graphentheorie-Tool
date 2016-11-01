package src.main.java.Uebungen;

import src.main.java.Functions.Converter;
import src.main.java.Deliveries.Example_Delivery_U1A1;
import src.main.java.Functions.CalculateDegrees;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NullP0int in October 2016.
 */

public class Uebung1 {

    Example_Delivery_U1A1 exampleDelivery_U1A_1;

    public Uebung1(Example_Delivery_U1A1 exampleDelivery_U1A_1, Converter convert) {

        // This is for U1
        this.exampleDelivery_U1A_1 = exampleDelivery_U1A_1;
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
        // This is the end for U1
    }

}
