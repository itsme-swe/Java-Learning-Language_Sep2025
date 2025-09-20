package lambdaExpression;

interface NewLambda {
    public void display();
}

class Demo {
    int temp = 10;

    public void meth1() {
        int count = 20;

        NewLambda m = () -> {
            int x = 0;
            System.out.println("Hi");
            System.out.println("Bye " + (++temp));
            // count++;  cannot modify until it becomes final
        };
        m.display();
    }
}

public class CapturingMembersInLambda {

    public static void main(String[] args) {

        Demo d1 = new Demo();

        d1.meth1();
    }
}
