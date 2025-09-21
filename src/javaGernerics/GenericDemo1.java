package javaGernerics;

class Data<T> {

    private T obj;

    public void setData(T val) {
        this.obj = val;
    }

    public T getData() {
        return this.obj;
    }
}

public class GenericDemo1 {

    public static void main(String[] args) {

        Data<Integer> d = new Data<>();

        d.setData(10);

        System.out.println(d.getData());

    }
}
