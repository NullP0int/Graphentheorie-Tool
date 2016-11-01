package src.main.java.Functions;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NullP0int in October 2016.
 */

public abstract class AbstractToString {

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


            if(i == (BasicList.size() - 1) ) {
                // if this is the last list
                if(ListString.equals("")) {
                    retListString = retListString + ("/* " + i + " */ " + "{}\n");
                } else {
                    retListString = retListString + ("/* " + i + " */ " + "{" + ListString.substring(0, ListString.length() - 1) + "}\n");
                }
            } else {
                // if not ...
                if(ListString.equals("")) {
                    retListString = retListString + ("/* " + i + " */ " + "{}\n");
                } else {
                    retListString = retListString + ( "/* " + i + " */ " + "{" + ListString.substring(0, ListString.length()-1)  + "}" + ",\n");
                }
            }
        }
        return retListString;
    }

}
