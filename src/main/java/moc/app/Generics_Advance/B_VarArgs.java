package moc.app.Generics_Advance;

public class B_VarArgs {

    public static void main(String[] args) {

    }


    public static void printShoppingList(String... items) {
        System.out.println("SHOPPING LIST");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + 1 + ": " + items[i]);
        }
        System.out.println();

    }



}
