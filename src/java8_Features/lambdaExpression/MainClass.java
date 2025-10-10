package java8_Features.lambdaExpression;

public class MainClass {

    public static void main(String[] args) {

        Employee_Interface softEng = (name) -> name;

        softEng.sayHello("Harsh");

        Employee_Interface.welcomeMsg("Harsh");

    }
}
