package src.main.java.Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by NullP0int in November 2016.
 */

public class BreadthFirst implements IsearchStrategy {

    private int count;
    private int[] b;
    private boolean[] r;
    private LinkedList<Integer> W = new LinkedList<>();
    private List<ArrayList> graphList;
    private List<ArrayList> B = new ArrayList<>();

    @Override
    public void search(List<ArrayList> graphList) {

        int v, w;
        b = new int[graphList.size()];
        r = new boolean[graphList.size()];
        this.graphList = graphList;
        count = 0;

        v = getStartNode();

        while(v != -1 ) {
            W.add(v);
            r[v] = true;

            while(!W.isEmpty()) {
                w = W.removeFirst();
                BFSVisit(w);
            }

            v = getStartNode();
        }



        // --------- JUST FOR TEST -------------- //
        String Sd = "";
        ArrayList e;
        for(int i = 0; i < b.length; i++) {
            Sd = Sd + b[i] + ", ";
        }

        String Sf = "";
        for(int i = 0; i < B.size(); i++) {

            e = B.get(i);
            System.out.println(e.get(0) + " , " + e.get(1));

            //Sf = Sf + B[i] + ", ";
        }

        System.out.println(Sd);
        System.out.println(Sf);

    }

    private void BFSVisit(int v) {

        ArrayList nv;
        int w;

        count++;

        b[v] = count;
        nv = graphList.get(v);

        for(int i = 0; i < nv.size(); i++) {
            w = (Integer) nv.get(i);

            if(!r[w]) {
                ArrayList<Integer> tmp = new ArrayList();
                tmp.add(v);
                tmp.add(w);

                B.add(tmp);

                r[w] = true;
            }
        }
    }

    private int getStartNode() {
        for(int v = 0; v < b.length; v++) {
            if(b[v] == 0) {
                return v;
            }
        }

        return -1;
    }

}
