package lambdaExpression;

interface My {
    public void display(String str);
}


public class MethodRefToNonStaticMember {

    public void reverse(String s) {
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
    }

    public static void main(String[] args) {

        MethodRefToNonStaticMember mr = new MethodRefToNonStaticMember();

        My ld = mr::reverse;

        ld.display("Hello");

    }
}
