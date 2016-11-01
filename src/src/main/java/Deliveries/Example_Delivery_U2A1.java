package src.main.java.Deliveries;

import java.util.*;

public class Example_Delivery_U2A1 {


    // Adjazenzmatrix
    public static int[][] a = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 1, 0, 1, 0, 0, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {1, 0, 0, 1, 1, 0, 1, 0}
    };

    // Matrix mit den Wegezahlen hier angeben
    public static int[][] b = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
    };

    // Matrix mit den Wegezahlen hier angeben
    public static int[][] c = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    public static int[][] d = {
            {1, 2, 3},
            {4, 5, 6},
    };

    public static int[][] e = {
            {1, 4},
            {2, 5},
            {3, 6}
    };

    // this is the Matrix for U2A2
    public static int[][] DFSBFSGraph = {
            {0, 1, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0}
    };


}