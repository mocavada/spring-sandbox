package moc.app.DataStructure_Advance;

import java.util.LinkedList;
import java.util.logging.Logger;

public class A_LinkedList {

    static Logger logger = Logger.getLogger(A_LinkedList.class.getName());

    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("A");
        myList.add("B");
        myList.add(1,"C");
        logger.info(String.valueOf(myList));
    }

}
