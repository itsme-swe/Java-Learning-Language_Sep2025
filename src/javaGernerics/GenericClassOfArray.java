package javaGernerics;

@SuppressWarnings("unchecked")
class MyArray<T> {

    T[] A = (T[]) new Object[10];
    int length = 0;

    public void append(T val) {
        A[length++] = val;
    }

    public void display() {

        for (int i = 0; i < length; i++) {
            System.out.print(A[i] + " ");
        }
    }

}

public class GenericClassOfArray {

    public static void main(String[] args) {

        MyArray<Integer> arr = new MyArray<>();

        arr.append(10);
        arr.append(20);
        arr.append(30);
        arr.append(50);
        arr.append(10);

        arr.display();
    }
}
