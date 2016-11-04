package src.main.java.Uebungen;

import src.main.java.Deliveries.Example_Delivery_U2;
import src.main.java.Exceptions.AddMatrixException;
import src.main.java.Exceptions.MultiplyMatrixException;
import src.main.java.Functions.CalculateWays;
import src.main.java.Functions.Converter;
import src.main.java.Search.BreadthFirst;
import src.main.java.Search.DepthFirst;
import src.main.java.Search.Search;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NullP0int in November 2016.
 */

public class Uebung2 {

    Example_Delivery_U2 exampleDelivery_U2;

    public Uebung2(Example_Delivery_U2 exampleDelivery_U2, Converter convert) throws AddMatrixException, MultiplyMatrixException {

        this.exampleDelivery_U2 = exampleDelivery_U2;

        //U2 a1
        CalculateWays calcWays = new CalculateWays();
        System.out.println("Mount of ways between two vertexes with length 8 (Uebung 2.1)");
        System.out.println(calcWays.calcWaysToMatrixToString(exampleDelivery_U2.a, 8));

        // U2 a2
        // First print the Matrix and the List
        System.out.println("This is your search-graph as matrix");
        System.out.println(convert.MatrixToString(exampleDelivery_U2.VLGraph));
        List<ArrayList> DFSBFSList = convert.MatrixToList(exampleDelivery_U2.VLGraph);
        System.out.println("This is your search-graph as list");
        System.out.println(convert.ListToString(DFSBFSList));

        System.out.println("DepthFirst Search: ");
        Search search = new Search(new DepthFirst());
        search.executeSearch(DFSBFSList);
        System.out.println(search.printSearch());

        // BreadthFirst is not working correctly at the moment. I will fix this soon :-)
        System.out.println("BreadthFirst Search: ");
        search.setSearch(new BreadthFirst());
        search.executeSearch(DFSBFSList);
        System.out.println(search.printSearch());

        // This is the end for U2

    }

}
