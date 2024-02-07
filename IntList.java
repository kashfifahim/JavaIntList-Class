public class IntList {
    public int first;
    public IntList rest;

    public IntList(int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    /* Return the size of the list using recursion */
    public int size() {
        // Base case
        if (rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    /** Size of the list without recursion */
    public int iterativeSize() {
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }

    /** TO DO */
    public int get(int ithItem) {
        return 0;

    }
}