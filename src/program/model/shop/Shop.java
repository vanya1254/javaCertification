package program.model.shop;

public class Shop<T> {
    private static final int startSize = 1;
    private T[] store;
    private int size;

    public Shop(T[] store) {
        this.store = store;
        this.size = store.length;
    }

//    public Shop() {
//        this.store = (T[]) new Object[startSize];
//        this.size = 0;
//    }


}
