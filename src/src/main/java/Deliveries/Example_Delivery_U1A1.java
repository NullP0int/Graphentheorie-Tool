package src.main.java.Deliveries;

import java.util.*;

public class Example_Delivery_U1A1 {


    // Adjazenzmatrix zu Aufgabe a
    public static int[][] adjMatrixA =
            {
                    {0,1,1,1,0,0,0,0,1,0},
                    {1,0,1,1,1,0,1,1,1,0},
                    {1,1,0,1,0,1,1,0,1,1},
                    {1,1,1,0,0,0,1,0,1,1},
                    {0,1,0,0,0,1,1,0,1,1},
                    {0,0,1,0,1,0,0,0,0,1},
                    {0,1,1,1,1,0,0,0,0,1},
                    {0,1,0,0,0,0,0,0,1,0},
                    {1,1,1,1,1,0,0,1,0,1},
                    {0,0,1,1,1,1,1,0,1,0}
            };
    // Adjazenzlistendarstellung zu Aufgabe a hier angeben
    public static int[][] adjListeA =
            {
                /* 0 */ { },
                /* 1 */ { },
                /* 2 */ { },
                /* 3 */ { },
                /* 4 */ { },
                /* 5 */ { },
                /* 6 */ { },
                /* 7 */ { },
                /* 8 */ { },
                /* 9 */ { }
            };
    // Adjazenzliste zu Aufgabe b
    public static int[][] adjListeB =
            {
                /* 0 */ {4, 7, 8 },
                /* 1 */ {3, 6 },
                /* 2 */ {3, 8 },
                /* 3 */ {1, 2, 5, 6, 7, 8 },
                /* 4 */ {0, 6, 7, 8 },
                /* 5 */ {3, 6, 8 },
                /* 6 */ {1, 3, 4, 5 },
                /* 7 */ {0, 3, 4, 8, 9 },
                /* 8 */ {0, 2, 3, 4, 5, 7 },
                /* 9 */ {7 }
            };
    // Adjazenzmatrix zu Aufgabe b hier angeben
    public static int[][] adjMatrixB =
            {
                    {0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,0,0,0}
            };

}