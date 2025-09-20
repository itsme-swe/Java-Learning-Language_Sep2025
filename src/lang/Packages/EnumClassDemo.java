package lang.Packages;

enum Dept {
    CS, CIVIL, IT, ECE
}

public class EnumClassDemo {

    public static void main(String[] args) {

        Dept d = Dept.IT;

        Dept list[] = Dept.values();

        for (Dept ele : list) {
            System.out.print(ele + " ");    // CS CIVIL IT ECE
        }

        
    }
}
