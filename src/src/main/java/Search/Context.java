package src.main.java.Search;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by NullP0int in November 2016.
 */

public class Context {

    private IsearchStrategy strategy;

    public Context(IsearchStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeSearch(List<ArrayList> graphList) {
        strategy.search(graphList);
    }

}
