package javaGernerics;

@SuppressWarnings("unchecked")
class NewArray<T> {

    T[] Arr = (T[]) new Object[5];
    int length = 0;

    public void append(T val) {
        Arr[length++] = val;
    }

    public void display() {
        for (int i = 0; i < length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }

}

public class GenericWildCardDemo {

    static void fun(NewArray<?> obj) {
        obj.display();
    }

    public static void main(String[] args) {

        NewArray<String> ma1 = new NewArray<>();
        ma1.append("Harsh");
        ma1.append("Mehra");

        NewArray<Integer> ma2 = new NewArray<>();
        ma2.append(10);
        ma2.append(20);

        fun(ma1);   // Harsh Mehra

        fun(ma2);   // 10 20
    }
}
