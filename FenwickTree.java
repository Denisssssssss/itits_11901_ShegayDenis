package sem3;

public class FenwickTree {

    private int[] a;

    public FenwickTree(int[] array) {

        a = new int[array.length + 1];
        for (int i = 0; i < array.length; i++)
            add(i + 1, array[i]);
    }

    public boolean searchElement(int element) {

        for (int i = 2; i < a.length; i++) {
            if (sum(i) - sum(i - 1) == element)
                return true;
        }

        return false;
    }

    public void add(int pos, int digit) {

        while (pos < a.length) {
            a[pos] += digit;
            pos += pos & (-1 * pos);
        }
    }

    public void delete(int pos, int digit) {

        add(pos, -1 * digit);
    }

    public int sum(int amount) {

        int sum = 0;
        while (amount > 0) {
            sum += a[amount];
            amount -= amount & (-1 * amount);
        }

        return sum;
    }

    public int rangeSum(int from, int to) {

        return sum(to) - sum(from - 1);
    }
}
