package src.main.java.Search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by NullP0int in November 2016.
 */

public class BreadthFirst implements IsearchStrategy {

    private int[] color;
    // colors
    // 0 = White    = undiscovered
    // 1 = Gray     = discovered
    // 2 = Back     = processed

    // Array of visited vertexes
    private boolean[] visited;

    // distance (-10 is infinite)
    private int[] d;

    // BFS-Number
    private int[] b;

    // queue
    private LinkedList<Integer> queue;

    // private graphList
    private List<ArrayList> graphList;

    // Counter for visited vertex
    private int BFSCounter;

    private int distanceCounter;

    @Override
    public void search(List<ArrayList> graphList) {

        // initialize variables
        d = new int[graphList.size()];
        b = new int[graphList.size()];
        visited = new boolean[graphList.size()];
        this.graphList = graphList;
        BFSCounter = 0;
        distanceCounter = 0;
        queue = new LinkedList<>();

        int vertex;
        int discVertex;

        for(int i = 0; i < graphList.size(); i++) {
            // set all to infinite
            d[i] = -10;
            b[i] = -10;
            visited[i] = false;
        }

        vertex = getStartNode();
        d[vertex] = distanceCounter;

        while(vertex != -1) {
            queue.add(vertex);
            visited[vertex] = true;

            while(!queue.isEmpty()) {
                discVertex = queue.removeFirst();
                //if(d[discVertex] == -10) {
                BFSVisit(discVertex);
                //}
            }

            vertex = getStartNode();

        }

    }

    private void BFSVisit(int discVertex) {

        ArrayList<Integer> vertexList = graphList.get(discVertex);
        BFSCounter++;
        b[discVertex] = BFSCounter;
        //d[discVertex] = 0;
        distanceCounter++;
        int tmpVertex;

        for(int i = 0; i < vertexList.size(); i++) {

            tmpVertex = vertexList.get(i);

            if(d[tmpVertex] == -10) {
                visited[tmpVertex] = true;
                d[tmpVertex] = d[discVertex] + 1;

                queue.add(tmpVertex);
            }
        }
    }


    private int getStartNode() {
        for(int v = 0; v < b.length; v++) {
            if(b[v] == -10) {
                return v;
            }
        }

        return -1;
    }

    public String printSearch() {
        String Sd = "";
        for(int i = 0; i < b.length; i++) {
            Sd = Sd + b[i] + ", ";
        }

        String Sf = "";
        for(int i = 0; i < d.length; i++) {
            Sf = Sf + d[i] + ", ";
        }

        return (Sd + "\n" + Sf);
    }

}
