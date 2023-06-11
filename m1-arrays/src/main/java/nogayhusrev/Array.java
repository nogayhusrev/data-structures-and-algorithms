package nogayhusrev;

public class Array {

    private int[] items;
    private int count;

    public Array(int length) {
        items = new int[length];
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        return items[index];
    }

    public void insert(int item) {

        if (items.length == count) {
            int[] newItems = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newItems[i] = items[i];
            }
            items = newItems;
        }

        items[count++] = item;
    }

    public void insertAt(int item, int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        items[index] = item;
    }

    public void removeAt(int index) {

        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;

    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) return i;
        }

        return -1;
    }

    public int max() {
        int max = items[0];
        for (int i = 1; i < count; i++) {
            if (max < items[i]) max = items[i];
        }

        return max;
    }

    public Array intersect(Array other) {
        var intersection = new Array(count);

        for (int item : items) {
            if (other.indexOf(item) >= 0)
                intersection.insert(item);
        }

        return intersection;

    }

    public void reverse() {
        int[] reversedItems = new int[items.length];

        int i = 0;
        int j = count - 1;

        while (i < count && j >= 0) {

            reversedItems[i] = items[j];
            i++;
            j--;
        }

        items = reversedItems;
        print();
    }


    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }
}
