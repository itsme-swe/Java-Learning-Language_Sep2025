package java8_Features.functionalInterface.supplierInterface;

import java.util.function.Supplier;

public class SupplierInterface_Demo1 {

    static void main(String[] args) {

        Supplier<Integer> sp = () -> 1;

        System.out.println(sp.get());
    }
}
