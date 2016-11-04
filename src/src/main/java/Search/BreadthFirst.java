package src.main.java.Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by NullP0int in November 2016.
 */

public class BreadthFirst implements IsearchStrategy {

    private List<ArrayList> graphList;
    private int[] d;
    private int[] b;

    // queue
    private LinkedList<Integer> queue;

    @Override
    public void search(List<ArrayList> graphList) {

        this.graphList = graphList;
        d = new int[graphList.size()];
        b = new int[graphList.size()];
        queue = new LinkedList<>();

        for(int i = 0; i < graphList.size(); i++) {
            d[i] = -10;
            b[i] = -10;
        }

        int counter = 0;

        for(int i = 0; i < graphList.size(); i++) {
            if(d[i] == -10) {
                counter = BFSVisit(i, counter);
            }
        }
    }

    private int BFSVisit(int s, int counter) {

        d[s] = 0;
        queue.clear();
        queue.add(s);
        int u;
        ArrayList<Integer> tmpList;

        while(queue.size() != 0) {

            u = queue.remove(0);
            tmpList = graphList.get(u);

            counter = counter + 1;

            b[u] = counter;

            for(int i = 0; i < tmpList.size(); i++) {
                int v = tmpList.get(i);

                if(d[v] == -10) {
                    d[v] = d[u] + 1;
                    queue.add(v);
                }
            }
        }

        return counter;
    }

    @Override
    public String printSearch() {

        String Sd = "";
        for(int i = 0; i < b.length; i++) {
            Sd = Sd + b[i] + ", ";
        }

        String Sf = "";
        for(int i = 0; i < d.length; i++) {
            Sf = Sf + d[i] + ", ";
        }

        return ("BFS-number: " + Sd + "\n" + "Distance: " + Sf + "\n");
    }
}
