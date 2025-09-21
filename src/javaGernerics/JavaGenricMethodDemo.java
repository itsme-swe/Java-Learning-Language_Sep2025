package javaGernerics;

public class JavaGenricMethodDemo {

    static <E> void display(E[] list) {

        for (E ele : list) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {

        display(new String[]{"Java", "React", "Go", "Postgres", "MongoDB"});

        // op: Java React Go Postgres MongoDB

        display(new Integer[]{10, 20, 30, 40, 50});

        // op: 10 20 30 40 50
    }
}
