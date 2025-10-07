package java8_Features.lambdaExpression;

@FunctionalInterface
interface SumValue {
    int add(int x, int y);
}

public class LambdaDemo_1 {

    static void main(String[] args) {

        SumValue val = (a, b) -> a + b;

        int result = val.add(10, 20);

        System.out.println(result); // 30

    }
}
