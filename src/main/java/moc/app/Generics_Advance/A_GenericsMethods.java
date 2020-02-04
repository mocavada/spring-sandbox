package moc.app.Generics_Advance;


import java.util.List;

public class A_GenericsMethods {

    A_GenericsMethods() {
    }

    public static <T> List<T> arrayToList(T[] array, List<T> list) {

        for (T object : array) {

            list.add(object);
        }
        return list;
    }
}
