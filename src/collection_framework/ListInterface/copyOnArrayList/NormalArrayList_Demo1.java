package collection_framework.ListInterface.copyOnArrayList;

import java.util.ArrayList;

public class NormalArrayList_Demo1 {

    static void main() {

        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Milk");
        shoppingList.add("Curd");
        shoppingList.add("Bread");
        shoppingList.add("Toast");

        for (String x : shoppingList) {
            System.out.println(x);
            if (x.equals("Bread")) {
                shoppingList.add("Eggs");
                System.out.println("Egg added to the shopping list");
            }
        }

        System.out.println("Updated shopping list: " + shoppingList);
    }

}

/*
🔸 output →
* Milk
*Curd
*Bread
*Egg added to the shopping list
*Exception in thread "main" java.util.ConcurrentModificationException
        at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        at collection_framework.ListInterface.copyOnArrayList.NormalArrayList.main(NormalArrayList.java:16)

◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽◽
When we iterate through an ArrayList using an enhanced for-loop, Java internally uses an Iterator object.
The iterator expects the collection to remain structurally unchanged during iteration.

So, when we try to add or remove elements directly from the list while iterating, the iterator detects this structural modification and throws a ConcurrentModificationException.

To handle concurrent or modification-safe scenarios, we can use:

CopyOnWriteArrayList (thread-safe, modification-safe)

or manually use an Iterator with its own .remove() method.
*/