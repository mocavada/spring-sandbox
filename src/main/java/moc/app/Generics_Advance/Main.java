package moc.app.Generics_Advance;

import java.util.ArrayList;
import java.util.List;

public class Main {
//
//    static Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {

    System.out.println( "\nA. Generics_Advance > GenericMethods");
    A_GenericsMethods genericsMethods = new A_GenericsMethods();

        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        Integer[] intArray = {1, 2, 3, 4, 8, 9, 100};
        Boolean[] boolArray = {true, false, true, true};

        List<Character> charList = genericsMethods.arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = genericsMethods.arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = genericsMethods.arrayToList(intArray, new ArrayList<>());
        System.out.println(intList.get(2));

    System.out.println("\nB. Generics_Advance > VarArgs");
    B_VarArgs BVarArgs = new B_VarArgs();

        String item1 = "Apples";
        String item2 = "Oranges";
        String item3 = "Pears";
        BVarArgs.printShoppingList(item1, item2, item3);
        BVarArgs.printShoppingList("Bread", "Milk", "Eggs", "Bananas");
        BVarArgs.printShoppingList(item2);

    }
}
