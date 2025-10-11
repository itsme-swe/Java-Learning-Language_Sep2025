package java8_Features.functionalInterface.supplierInterface;

import java.util.function.Supplier;

public class Main {

    public static double generateRandom() {
        return 1 + Math.random() * 10;
    }

    static void main() {

        Supplier<Double> randNum = Main::generateRandom;    // using Method Reference

        System.out.println(randNum.get());  // 5.3950413013279475

    }
}
