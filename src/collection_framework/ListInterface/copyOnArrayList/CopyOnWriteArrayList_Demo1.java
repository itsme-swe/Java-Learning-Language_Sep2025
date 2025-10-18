package collection_framework.ListInterface.copyOnArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_Demo1 {

    static void main() {

        List<String> shoppingList = new CopyOnWriteArrayList<>();

        shoppingList.add("Bread");
        shoppingList.add("Milk");
        shoppingList.add("Butter");
        shoppingList.add("Toast");

        for (String item : shoppingList) {
            System.out.println(item);
            if (item.equals("Butter")) {
                shoppingList.add("Cream");
                System.out.println("Cream added to the shopping list");
            }
        }

        System.out.println("Updated shopping list: " + shoppingList);

    }
}
/*
 * Bread
 * Milk
 * Butter
 * Cream added to the shopping list
 * Toast
 * Updated shopping list: [Bread, Milk, Butter, Toast, Cream]
 * */