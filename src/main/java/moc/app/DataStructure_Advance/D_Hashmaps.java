package moc.app.DataStructure_Advance;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class D_Hashmaps {

    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        phoneBook.put("Kevin", 123344);
        phoneBook.put("Jill", 333343);
        phoneBook.put("Brenda",34434);
        phoneBook.put("Brenda",66666);
        phoneBook.put(null, 0000);

        if(phoneBook.containsKey("Brenda")) {
            phoneBook.remove("Brenda");
        }

        System.out.println(phoneBook);


        LinkedHashMap<String, Integer> contacts = new LinkedHashMap<>(4, 0.75f, false);
        contacts.put("Gary", 123344);
        contacts.put("Great", 66666);
        contacts.put("Movie", 34434);
        contacts.put("Salmon", 34434);
        contacts.put("Bret", 34434);
        contacts.put(null, 0000);

        System.out.println("\nContacts :" + contacts);

        for(Map.Entry<String, Integer> entry: contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
