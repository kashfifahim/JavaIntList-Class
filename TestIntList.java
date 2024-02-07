public class TestIntList {
    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(10, null);
        L.rest.rest = new IntList(15, null);
    }
}
