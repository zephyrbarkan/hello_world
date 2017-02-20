public class Stack {
    private int[] copy;
    public void change1(int[] i){
        change2(i);
        System.out.println("change1: " + (this.copy == i));
        i[0] = i[0] + 100;
        for (int elem: i) {
            System.out.print(elem);
        }
        System.out.println("\n");
    }

    public void change2(int[] i){
        int[] j = {0, 0, 0};
        i = j;
        for (int elem: i) {
            System.out.print(elem);
        }
        System.out.println("\n");
        System.out.println("checking in change2: " + (this.copy == i));
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3};
        this.copy = arr;
        System.out.println("checking in main: " + (this.copy == arr));
        change1(arr);
        System.out.println(arr[0]);
    }
}
