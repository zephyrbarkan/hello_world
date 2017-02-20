/**
 * Created by Home on 2/1/17.
 */
public class ArrayDeque<Item> {
    private Item[] items;
    private int front;
    private int back;
    private int num;
    private boolean wrapped;

    public ArrayDeque() {
        this.front = 0;
        this.back = 0;
        this.num = 0;
        wrapped = faslse;
        items = (Item[]) new Object[8];
    }

    public void resize(int capacity) {
        Item[] copy = (Item[]) new Object[capacity];
        if (this.wrapped) {
            System.arraycopy(items, front + 1, copy, 0, items.length - front);
            System.arraycopy(items, 0, copy, items.length - 1 - (front + 1), back - 1);
            this.back = items.length - front + back - 1;
            items = copy;
            this.front = items.length - 1;
        } else {
            System.arraycopy(items, front - 1, copy, 0, num);
            items = copy;
            this.front = items.length;
        }
    }

    public void addFirst(Item i) {
        if (back == items.length - 1 || back + 1 == front) {
            resize(this.num * 2);
        }
        if (this.front == 0) {
            items[this.front] = i;
            this.front = items.length - 1;
            this.back = 1;
            this.num = num + 1;
            this.wrapped = true;
        } else {
            items[this.front] = i;
            this.front = this.front - 1;
        }
        num = num + 1;
    }

    public void addLast(Item i) {
        if (back == items.length - 1 || back + 1 == front) {
            resize(this.num * 2);
        }
        items[back] = i;
        back += 1;
        num += 1;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public int size() {
        return this.num;
    }

    public void printDeque() {

    }

    public Item removeFirst() {
        if (isEmpty()) {
            return null;
        }
        Item rv = items[this.front - 1];
        items[this.front - 1] = null;
        if (this.front == items.length - 1) {
            this.front = 0;
            this.wrapped = false;
        } else {
            this.front = this.front + 1;
        }
        double usageRatio = (double) this.num / this.items.length;
        if (usageRatio <= .25 && this.num >= 16) {
            resize(this.num / 2);
        }
        this.num -= 1;
        return rv;
    }

    public Item removeLast() {
        if (isEmpty()) {
            return null;
        }
        Item rv = items[this.back - 1];
        items[this.back - 1] = null;
        double usageRatio = (double) this.num / this.items.length;
        if (usageRatio <= .25 && this.num >= 16) {
            resize(this.num / 2);
        }
        this.num -= 1;
        this.back -= 1;
        return rv;
    }

    public Item get(int index) {
        return null;
    }

}
