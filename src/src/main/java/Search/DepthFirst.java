package src.main.java.Search;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NullP0int in November 2016.
 */

public class DepthFirst implements IsearchStrategy {

    // Graph
    private List<ArrayList> graphList = null;

    private int[] color;
    // colors
    // 0 = White    = undiscovered
    // 1 = Gray     = discovered
    // 2 = Back     = processed

    // time variable
    private int time = 0;
    private int[] d;
    private int[] f;

    @Override
    public void search(List<ArrayList> graphList) {

        // set graph
        this.graphList = graphList;
        color = new int[graphList.size()];
        d = new int[graphList.size()];
        f = new int[graphList.size()];

        // set all vertexes as undiscovered (0)
        for(int i = 0; i < graphList.size(); i++) {
            color[i] = 0;
        }

        // start discovering
        for(int i = 0; i < graphList.size(); i++) {
            if(color[i] == 0) {
                DFSVisit(i);
            }

        }


        // --------- JUST FOR TEST -------------- //
        String Sd = "";
        for(int i = 0; i < d.length; i++) {
            Sd = Sd + d[i] + ", ";
        }

        String Sf = "";
        for(int i = 0; i < f.length; i++) {
            Sf = Sf + f[i] + ", ";
        }

        System.out.println(Sd);
        System.out.println(Sf);

    }

    private void DFSVisit(int vertexNumber) {

        // set vertex as descovered (1)
        color[vertexNumber] = 1;

        // increment and set vertex descovered time
        time++;
        d[vertexNumber] = time;

        ArrayList vertexList = graphList.get(vertexNumber);

        // check the following vertexes
        for(int i = 0; i < vertexList.size(); i++) {

            if(color[i] == 0) {
                DFSVisit(i);
            }
        }

        // vertex processed
        color[vertexNumber] = 2;
        time++;
        f[vertexNumber] = time;
    }
}
