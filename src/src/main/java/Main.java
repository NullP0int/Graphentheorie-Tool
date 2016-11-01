package src.main.java;

import src.main.java.Deliveries.Example_Delivery_U1A1;
import src.main.java.Deliveries.Example_Delivery_U2A1;
import src.main.java.Exceptions.MultiplyMatrixException;
import src.main.java.Functions.CalculateWays;
import src.main.java.Functions.Converter;
import src.main.java.Search.Context;
import src.main.java.Search.DepthFirst;
import src.main.java.Uebungen.Uebung1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NullP0int in October 2016.
 */

public class Main {

    public static void main(String[] args) throws MultiplyMatrixException {

        Converter convert = new Converter();

        //U1
        //Example_Delivery_U1A1 exampleDelivery_U1A_1 = new Example_Delivery_U1A1();
        //Uebung1 uebung1 = new Uebung1(exampleDelivery_U1A_1, convert);

        //U2 a1
        Example_Delivery_U2A1 exampleDelivery_U2A_1 = new Example_Delivery_U2A1();
        CalculateWays calcWays = new CalculateWays();
        System.out.println(calcWays.calcWaysToMatrixToString(exampleDelivery_U2A_1.a, 8));

        // U2 a2
        // First print the Matrix and the List
        System.out.println(convert.MatrixToString(exampleDelivery_U2A_1.DFSBFSGraph));
        List<ArrayList> DFSBFSList = convert.MatrixToList(exampleDelivery_U2A_1.DFSBFSGraph);
        System.out.println(convert.ListToString(DFSBFSList));

        Context search = new Context(new DepthFirst());
        search.executeSearch(DFSBFSList);

        // This is the end for U2
    }
}
