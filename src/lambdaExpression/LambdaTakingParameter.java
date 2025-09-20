package lambdaExpression;

interface AddValues {
    public int add(int x, int y);
}

public class LambdaTakingParameter {

    public static void main(String[] args) {

        AddValues val = (a, b) -> a + b;

        int result = val.add(20, 30);

        System.out.println(result); // 50;
    }
}
