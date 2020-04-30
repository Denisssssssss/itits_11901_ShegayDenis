package sem3;

public class Main {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        FenwickTree fTree = new FenwickTree(a);
        fTree.add(10, 10);
        System.out.println(fTree.searchElement(10));
        System.out.println(fTree.sum(10));
        System.out.println(fTree.rangeSum(2, 5));
        fTree.delete(10, 10);
        System.out.println(fTree.searchElement(10));
        System.out.println(fTree.sum(10));
        System.out.println(fTree.rangeSum(2, 5));
    }
}
