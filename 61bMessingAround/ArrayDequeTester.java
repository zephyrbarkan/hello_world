/**
 * Created by Zoe Plaxco on 1/30/17.
 */

//Class to test the ArrayDeque class
//Basic testers (framework stolen from LinkedListDequeTest.java in same folder)
public class ArrayDequeTester {

    private static final int ELEVEN = 11;

    /* Utility method for printing out empty checks. */
    public static boolean checkEmpty(boolean expected, boolean actual) {
        if (expected != actual) {
            System.out.println("isEmpty() returned " + actual + ", but expected: " + expected);
            return false;
        }
        return true;
    }

    /* Utility method for printing out empty checks. */
    public static boolean checkSize(int expected, int actual) {
        if (expected != actual) {
            System.out.println("size() returned " + actual + ", but expected: " + expected);
            return false;
        }
        return true;
    }

    /* Prints a nice message based on whether a test passed.
     * The \n means newline. */
    public static void printTestStatus(boolean passed) {
        if (passed) {
            System.out.println("Test passed!\n");
        } else {
            System.out.println("Test failed!\n");
        }
    }

    /**
     * Adds a few things to the list, checking isEmpty() and size() are correct,
     * finally printing the results.
     * <p>
     * && is the "and" operation.
     */
    public static void addIsEmptySizeTest() {
        System.out.println("Running add/isEmpty/Size test.");

        // ArrayDeque<String> lld1 = new ArrayDeque<>();

        // boolean passed = checkEmpty(true, lld1.isEmpty());

        // lld1.addFirst("front");

        // // The && operator is the same as "and" in Python.
        // // It's a binary operator that returns true if both arguments true, and false otherwise.
        // passed = checkSize(1, lld1.size()) && passed;
        // passed = checkEmpty(false, lld1.isEmpty()) && passed;

        // lld1.addLast("middle");
        // passed = checkSize(2, lld1.size()) && passed;

        // lld1.addLast("back");
        // passed = checkSize(3, lld1.size()) && passed;

        // passed = lld1.get(1).equals("middle") && passed;
        // System.out.println("Get (should be front): " + lld1.get(0));

        // System.out.println("Printing out deque: ");
        // lld1.printDeque();

        // printTestStatus(passed);
    }

    /**
     * Adds an item, then removes an item, and ensures that dll is empty afterwards.
     * Then adds an item to the end, then removes it, all the while checking population
     */
    public static void addRemoveTest() {

        System.out.println("Running add/remove test.");

        ArrayDeque<Integer> lld1 = new ArrayDeque<>();
        // should be empty
        boolean passed = checkEmpty(true, lld1.isEmpty());
        System.out.print("The deque has not had anything in it: ");
        lld1.printDeque();

        lld1.addFirst(10);
        // should not be empty
        passed = checkEmpty(false, lld1.isEmpty()) && passed;
        System.out.print("\nThe deque should be just 10: ");
        lld1.printDeque();

        lld1.removeFirst();
        // should be empty
        System.out.print("\nThe deque should be empty: ");
        lld1.printDeque();
        //System.out.println("\nThe front is: " + lld1.getFront());
        passed = checkEmpty(true, lld1.isEmpty()) && passed;

        passed = (lld1.get(2) == null) && passed;

        System.out.println("The size when emptied is: " + lld1.size());

        lld1.addLast(ELEVEN);
        //should not be empty
        System.out.println("Size now is: " + lld1.size());
        System.out.print("Deque: ");
        lld1.printDeque();
        passed = checkEmpty(false, lld1.isEmpty() && passed);
        System.out.println("\nGet (should be 11): " + lld1.get(0));
        //System.out.println("The front is: " + lld1.getFront());

        System.out.println("The size is: " + lld1.size());

        lld1.removeLast();
        //should be empty
        passed = checkEmpty(true, lld1.isEmpty() && passed);

        printTestStatus(passed);
    }

    //Ships off to the testers
    public static void main(String[] args) {
        System.out.println("Running tests.\n");
        addIsEmptySizeTest();
        addRemoveTest();
    }
}
