package src.main.java;

import src.main.java.Deliveries.Example_Delivery_U1;
import src.main.java.Deliveries.Example_Delivery_U2;
import src.main.java.Exceptions.AddMatrixException;
import src.main.java.Exceptions.MultiplyMatrixException;
import src.main.java.Functions.Converter;
import src.main.java.Uebungen.Uebung1;
import src.main.java.Uebungen.Uebung2;

/**
 * Created by NullP0int in October 2016.
 */

public class Main {

    public static void main(String[] args) throws MultiplyMatrixException, AddMatrixException {

        Converter convert = new Converter();

        //U1
        Example_Delivery_U1 exampleDelivery_U1A_1 = new Example_Delivery_U1();
        Uebung1 uebung1 = new Uebung1(exampleDelivery_U1A_1, convert);

        //U2 a1
        Example_Delivery_U2 example_delivery_u2 = new Example_Delivery_U2();
        Uebung2 uebung2 = new Uebung2(example_delivery_u2, convert);

        // This is the end for U2
    }
}
