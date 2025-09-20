package exceptionHandling;

class NegativeDimensionException extends Exception {

    public String toString() {
        return "Values cannot be in negative!!";
    }
}

public class ThrowAndThrowsDemo {

    static int area(int len, int bre) throws NegativeDimensionException {
        if (len < 0 || bre < 0) throw new NegativeDimensionException();
        return len * bre;
    }

    static void meth1() throws NegativeDimensionException {
        System.out.println(area(10, -1));
    }

    public static void main(String[] args) {

        try {
            meth1();
        } catch (NegativeDimensionException e) {
            System.out.println(e);
        }
    }
}

// op: Values cannot be in negative!!
