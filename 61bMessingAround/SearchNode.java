package hw3.puzzle;

/**
 * Created by Home on 3/19/17.
 */
public class SearchNode {
    private SearchNode prev;
    private int prevMoves;
    private String word;
    private int estimatedFuture;

    public SearchNode(String w, String goal) {
        this.prev = null;
        this.prevMoves = 0;
        this.word = w;
        setEstimatedFuture(goal);
    }

    public SearchNode(SearchNode last, String w, String goal) {
        this.prev = last;
        this.prevMoves = last.getPrevMoves() + 1;
        this.word = w;
        setEstimatedFuture(goal);
    }

    private void setEstimatedFuture(String goal) {
        int counter = 0;
        for (int i = 0; i < goal.length(); i++) {
            if (!goal.substring(i, i + 1).equals(word.substring(i, i + 1))) {
                counter++;
            }
        }
        this.estimatedFuture = counter;
    }

    public void setPrev(SearchNode p) {
        this.prev = p;
    }

    public SearchNode getPrev() {
        return this.prev;
    }

    public int getPrevMoves() {
        return prevMoves;
    }

    public int getEstimatedFuture() {
        return estimatedFuture;
    }
}
